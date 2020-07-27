package com.poy.jalanyuk

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.google.android.material.appbar.CollapsingToolbarLayout
import kotlinx.android.synthetic.main.activity_detail.*
import java.util.ArrayList

class Detail : AppCompatActivity() {

    internal lateinit var place: ArrayList<Place>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initData()

        initToolbar()

        initDataBindings()

        initActions()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        } else {
            Toast.makeText(this, "Clicked " + item.title, Toast.LENGTH_SHORT).show()
        }

        return super.onOptionsItemSelected(item)
    }

    private fun initData() {
        // get place detail
        place = PlaceRepository.placeList
    }


    private fun initDataBindings() {

        try {
            val id = Utils.getDrawableInt(applicationContext, place.get(Utils.index).imageName)
            Utils.setImageToImageView(applicationContext, placeImageView, id)

            placeDescTextView.text = place.get(Utils.index).desc
            addressTextView.text = place.get(Utils.index).opening
            phoneTextView.text = place.get(Utils.index).phone
            websiteTextView.text = place.get(Utils.index).website
            emailTextView.text = place.get(Utils.index).email


            val gradientImg = R.drawable.black_alpha_70
            Utils.setImageToImageView(applicationContext, gradientImageView, gradientImg)

        } catch (e: Exception) {
            Log.e("TEAMPS", "initDataBindings: ", e)
        }

    }

    private fun initActions() {

        viewAllReviewsTextView.setOnClickListener { Toast.makeText(this, "View All is clicked", Toast.LENGTH_SHORT).show() }

        writeReviewTextView.setOnClickListener {  Toast.makeText(this, "Write Review is clicked", Toast.LENGTH_SHORT).show() }

        phoneTextView.setOnClickListener {  Toast.makeText(this, "Phone is clicked", Toast.LENGTH_SHORT).show() }

        websiteTextView.setOnClickListener { Toast.makeText(this, "Website is clicked", Toast.LENGTH_SHORT).show() }

        emailTextView.setOnClickListener {  Toast.makeText(this, "Email is clicked", Toast.LENGTH_SHORT).show() }
    }

    private fun initToolbar() {

        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_24)

        if (toolbar.navigationIcon != null) {
            toolbar.navigationIcon?.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP)
        }

        toolbar.title = place.get(Utils.index).name

        try {
            toolbar.setTitleTextColor(ContextCompat.getColor(this,R.color.white))
        } catch (e: Exception) {
            Log.e("TEAMPS", "Can't set color.")
        }

        try {
            setSupportActionBar(toolbar)
        } catch (e: Exception) {
            Log.e("TEAMPS", "Error in set support action bar.")
        }

        try {
            if (supportActionBar != null) {
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
            }
        } catch (e: Exception) {
            Log.e("TEAMPS", "Error in set display home as up enabled.")
        }

        val collapsingToolbarLayout = findViewById<CollapsingToolbarLayout>(R.id.collapsingToolbar)

        if (Utils.isRTL) {
            collapsingToolbarLayout.collapsedTitleGravity = Gravity.END
            collapsingToolbarLayout.expandedTitleGravity = Gravity.END or Gravity.BOTTOM
        } else {
            collapsingToolbarLayout.collapsedTitleGravity = Gravity.START
            collapsingToolbarLayout.expandedTitleGravity = Gravity.START or Gravity.BOTTOM
        }

    }
}