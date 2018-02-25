package jvk.org.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Toast
import jvk.org.coderswag.R
import jvk.org.coderswag.model.Product
import jvk.org.coderswag.utils.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {
    private lateinit var product: Product

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)
        this.product = intent.getParcelableExtra(EXTRA_PRODUCT)
        val resourceId = resources.getIdentifier(product.image, "drawable", this.packageName)
        productImage.setImageResource(resourceId)
        productTitle.text = product.title
        productPrice.text = product.price
        productDescription.text = product.description
    }

    fun onBuyClicked(view: View) {
        Toast.makeText(this, "${this.product.title} added to your cart", Toast.LENGTH_SHORT).show()
    }
}
