package jvk.org.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jvk.org.coderswag.R
import jvk.org.coderswag.adapters.CategoryAdapter
import jvk.org.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoryAdapter(this,
                DataService.categories)
        categoriesListView.adapter = adapter
    }
}
