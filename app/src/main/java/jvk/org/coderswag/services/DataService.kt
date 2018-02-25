package jvk.org.coderswag.services

import jvk.org.coderswag.model.Category
import jvk.org.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage")
    )

    private val hats = listOf(
            Product("Hat 1", "$10", "hat1"),
            Product("Hat 2", "$12", "hat2"),
            Product("Hat 3", "$15", "hat3"),
            Product("Hat 4", "$14", "hat4")
    )

    private val hoodies = listOf(
            Product("Hoodie 1", "$10", "hoodie1"),
            Product("Hoodie 2", "$12", "hoodie2"),
            Product("Hoodie 3", "$15", "hoodie3"),
            Product("Hoodie 4", "$14", "hoodie4")
    )

    private val shirts = listOf(
            Product("Shirt 1", "$10", "shirt1"),
            Product("Shirt 2", "$12", "shirt2"),
            Product("Shirt 3", "$15", "shirt3"),
            Product("Shirt 4", "$14", "shirt4")
    )

    private val digitals = listOf<Product>()

    fun getProducts(category: String): List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else  -> digitals
        }
    }




}
