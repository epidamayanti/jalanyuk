package com.poy.jalanyuk

import android.content.ActivityNotFoundException
import android.content.Intent
import android.graphics.PorterDuff
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_contact.*
import kotlinx.android.synthetic.main.activity_contact.emailTextView
import kotlinx.android.synthetic.main.activity_contact.phoneTextView
import kotlinx.android.synthetic.main.activity_contact.toolbar
import kotlinx.android.synthetic.main.activity_contact.websiteTextView
import kotlinx.android.synthetic.main.activity_detail.*

class Contact : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)

        initUI()

        initActions()
    }

    private fun initToolbar() {

        toolbar.setNavigationIcon(R.drawable.baseline_arrow_back_black_24)

        if (toolbar.navigationIcon != null) {
            toolbar.navigationIcon?.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP)
        }

        toolbar.title = "Contact"

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
                //onBackPressed()
            }
        } catch (e: Exception) {
            Log.e("TEAMPS", "Error in set display home as up enabled.")
        }

    }

    private fun initUI() {
        initToolbar()

        val id = R.drawable.propict
        Utils.setCornerRadiusImageToImageView(applicationContext, profileImageView, id, 20, 2, R.color.white)

        val coverUserImageView = findViewById<ImageView>(R.id.coverUserImageView)
        Utils.setImageToImageView(applicationContext, coverUserImageView, id)


    }

    private fun initActions() {
        emailTextView.setOnClickListener {
            try {
                val intent = Intent(Intent.ACTION_VIEW)
                val data = Uri.parse("mailto:?subject=" + "Hello" + "&body=" + "About Awesome Material App")
                intent.data = data
                intent.putExtra(Intent.EXTRA_EMAIL, emailTextView.text.toString())
                startActivity(intent)

            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }

        phoneTextView.setOnClickListener {
            try {

                val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneTextView.text.toString()))
                startActivity(intent)

            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }

        websiteTextView.setOnClickListener {
            try {
                val myIntent = Intent(Intent.ACTION_VIEW, Uri.parse(websiteTextView.text.toString()))
                startActivity(myIntent)
            } catch (e: ActivityNotFoundException) {
                e.printStackTrace()
            }
        }
    }

}