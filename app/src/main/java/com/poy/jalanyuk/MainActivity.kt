package com.poy.jalanyuk

import android.content.Intent
import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    internal lateinit var placeArrayList: ArrayList<Place>
    internal lateinit var adapter: ListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()

        initUI()

        initDataBindings()

        initActions()


    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_filter, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId

        when (id) {
            android.R.id.home -> {
                finish()
                return true
            }
            R.id.action_contact -> {
                startActivity(Intent(this@MainActivity, Contact::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun initData() {
        // get place list
        placeArrayList = PlaceRepository.placeList
    }

    private fun initUI() {
        initToolbar()

        // get list adapter
        adapter = ListAdapter(placeArrayList)

        // get recycler view
        val mLayoutManager = LinearLayoutManager(applicationContext)
        placeList1RecyclerView.layoutManager = mLayoutManager
        placeList1RecyclerView.itemAnimator = DefaultItemAnimator()
    }

    private fun initDataBindings() {
        // bind adapter to recycler
        placeList1RecyclerView.adapter = adapter
    }

    private fun initActions() {
        adapter.setOnItemClickListener(object : ListAdapter.OnItemClickListener {
            override fun onItemClick(view: View, obj: Place, position: Int) {
                //Toast.makeText(this@MainActivity, "Selected : " + obj.name, Toast.LENGTH_LONG).show()
                Utils.index = position
                // start your next activity
                startActivity(Intent(this@MainActivity, Detail::class.java))
            }
        })

    }



    //region Init Toolbar
    private fun initToolbar() {

       // toolbar.setNavigationIcon(R.drawable.ic_baseline_menu_24)

        if (toolbar.navigationIcon != null) {
            toolbar.navigationIcon?.setColorFilter(ContextCompat.getColor(this, R.color.white), PorterDuff.Mode.SRC_ATOP)
        }

        toolbar.title = "Main Yuk!"

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
    }
}