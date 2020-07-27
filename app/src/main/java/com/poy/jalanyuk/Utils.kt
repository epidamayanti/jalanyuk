package com.poy.jalanyuk

import android.content.Context
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.Log
import android.util.TypedValue
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition
import java.util.*

object Utils {

    var index = 0

    val isRTL: Boolean
        get() = isRTL(Locale.getDefault())

    fun getDrawableInt(context: Context?, name: String?): Int {
        return context?.resources!!.getIdentifier(name, "drawable", context.packageName)
    }

    fun setImageToImageView(context: Context, imageView: ImageView, drawable: Int) {
        val requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.NONE) // because file name is always same
            .skipMemoryCache(true)

        Glide.with(context)
            .load(drawable)
            .apply(requestOptions)
            .transition(DrawableTransitionOptions.withCrossFade())
            .into(imageView)
    }

    fun setCornerRadiusImageToImageView(context: Context, imageView: ImageView, drawable: Int, radius: Int, borderWidth: Int, color: Int) {
        var requestOptions = RequestOptions()
            .diskCacheStrategy(DiskCacheStrategy.NONE) // because file name is always same
            .override(500, 500)
            .centerCrop()
            .skipMemoryCache(true)
        requestOptions = requestOptions.transforms(CenterCrop(), RoundedCorners(radius))

        if (borderWidth > 0) {
            Glide.with(context)
                .load(drawable)

                .apply(requestOptions)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(object : SimpleTarget<Drawable>() {
                    override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {

                        imageView.setImageDrawable(resource)

                        try {
                            val colorContextCompat = ContextCompat.getColor(context, color)

                            val bitmap = (imageView.drawable as BitmapDrawable).bitmap

                            if (bitmap != null) {
                                val d = BitmapDrawable(context.resources, getRoundedCornerBitmap(context, bitmap, colorContextCompat, radius, borderWidth))
                                imageView.setImageDrawable(d)
                            } else {
                                imageView.setImageDrawable(resource)
                            }
                        } catch (e: Exception) {
                            Log.e("TEAMPS", "onResourceReady: ", e)
                        }

                    }
                })
        } else {
            Glide.with(context)
                .load(drawable)
                .apply(requestOptions)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(imageView)
        }
    }

    private fun getRoundedCornerBitmap(context: Context, bitmap: Bitmap, color: Int, cornerDips: Int, borderDips: Int): Bitmap {
        val output = Bitmap.createBitmap(bitmap.width, bitmap.height,
            Bitmap.Config.ARGB_8888)
        val canvas = Canvas(output)

        val borderSizePx = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, borderDips.toFloat(),
            context.resources.displayMetrics).toInt()
        val cornerSizePx = TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, cornerDips.toFloat(),
            context.resources.displayMetrics).toInt()
        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)
        val rectF = RectF(rect)

        // prepare canvas for transfer
        paint.isAntiAlias = true
        paint.color = -0x1
        paint.style = Paint.Style.FILL
        canvas.drawARGB(0, 0, 0, 0)
        canvas.drawRoundRect(rectF, cornerSizePx.toFloat(), cornerSizePx.toFloat(), paint)

        // draw bitmap
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP)
        canvas.drawBitmap(bitmap, rect, rect, paint)

        // draw border
        paint.color = color
        paint.style = Paint.Style.STROKE
        paint.strokeWidth = borderSizePx.toFloat()
        canvas.drawRoundRect(rectF, cornerSizePx.toFloat(), cornerSizePx.toFloat(), paint)

        return output
    }

    private fun isRTL(locale: Locale): Boolean {
        val directionality = Character.getDirectionality(locale.displayName[0]).toInt()
        return directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT.toInt() || directionality == Character.DIRECTIONALITY_RIGHT_TO_LEFT_ARABIC.toInt()
    }
}