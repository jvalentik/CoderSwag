package jvk.org.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import jvk.org.coderswag.R
import jvk.org.coderswag.adapters.ProductsAdapter
import jvk.org.coderswag.services.DataService
import jvk.org.coderswag.utils.EXTRA_CATEGORY
import jvk.org.coderswag.utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    private lateinit var productsAdapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        productsAdapter = ProductsAdapter(this,
                DataService.getProducts(intent.getStringExtra(EXTRA_CATEGORY))) { product ->
            val productDetailIntent = Intent(this, ProductDetailActivity::class.java)
            productDetailIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productDetailIntent)
        }
        productsListView.adapter = productsAdapter
        var spanCount = if (resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT)  2 else 3
        if (resources.configuration.screenWidthDp > 720) spanCount = 3
        val layoutManager = GridLayoutManager(this, spanCount)
        productsListView.layoutManager = layoutManager
        productsListView.setHasFixedSize(true)
    }
}
