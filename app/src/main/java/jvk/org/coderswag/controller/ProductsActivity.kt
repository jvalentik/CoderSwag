package jvk.org.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import jvk.org.coderswag.R
import jvk.org.coderswag.utils.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val category = intent.getStringExtra(EXTRA_CATEGORY)
    }
}
