package jvk.org.coderswag.services

import jvk.org.coderswag.model.Category
import jvk.org.coderswag.model.Product

object DataService {
    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage"),
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITALS", "digitalgoodsimage")
    )

    private val hats = listOf(
            Product("Hat 1", "$10", "hat1", "Cool product, very high quality"),
            Product("Hat 2", "$12", "hat2", "Cool product, very high quality"),
            Product("Hat 3", "$15", "hat3", "Cool product, very high quality"),
            Product("Hat 4", "$14", "hat4", "Cool product, very high quality"),
            Product("Hat 1", "$10", "hat1", "Cool product, very high quality"),
            Product("Hat 2", "$12", "hat2", "Cool product, very high quality"),
            Product("Hat 3", "$15", "hat3", "Cool product, very high quality"),
            Product("Hat 4", "$14", "hat4", "Cool product, very high quality"),
            Product("Hat 1", "$10", "hat1", "Cool product, very high quality"),
            Product("Hat 2", "$12", "hat2", "Cool product, very high quality"),
            Product("Hat 3", "$15", "hat3", "Cool product, very high quality"),
            Product("Hat 4", "$14", "hat4", "Cool product, very high quality")
    )

    private val hoodies = listOf(
            Product("Hoodie 1", "$10", "hoodie1", "Cool product, very high quality"),
            Product("Hoodie 2", "$12", "hoodie2", "Cool product, very high quality"),
            Product("Hoodie 3", "$15", "hoodie3", "Cool product, very high quality"),
            Product("Hoodie 4", "$14", "hoodie4", "Cool product, very high quality"),
            Product("Hoodie 1", "$10", "hoodie1", "Cool product, very high quality"),
            Product("Hoodie 2", "$12", "hoodie2", "Cool product, very high quality"),
            Product("Hoodie 3", "$15", "hoodie3", "Cool product, very high quality"),
            Product("Hoodie 4", "$14", "hoodie4", "Cool product, very high quality"),
            Product("Hoodie 1", "$10", "hoodie1", "Cool product, very high quality"),
            Product("Hoodie 2", "$12", "hoodie2", "Cool product, very high quality"),
            Product("Hoodie 3", "$15", "hoodie3", "Cool product, very high quality"),
            Product("Hoodie 4", "$14", "hoodie4", "Cool product, very high quality"),
            Product("Hoodie 1", "$10", "hoodie1", "Cool product, very high quality"),
            Product("Hoodie 2", "$12", "hoodie2", "Cool product, very high quality"),
            Product("Hoodie 3", "$15", "hoodie3", "Cool product, very high quality"),
            Product("Hoodie 4", "$14", "hoodie4", "Cool product, very high quality")
    )

    private val shirts = listOf(
            Product("Shirt 1", "$10", "shirt1", "Cool product, very high quality"),
            Product("Shirt 2", "$12", "shirt2", "Cool product, very high quality"),
            Product("Shirt 3", "$15", "shirt3", "Cool product, very high quality"),
            Product("Shirt 4", "$14", "shirt4", "Cool product, very high quality"),
            Product("Shirt 1", "$10", "shirt1", "Cool product, very high quality"),
            Product("Shirt 2", "$12", "shirt2", "Cool product, very high quality"),
            Product("Shirt 3", "$15", "shirt3", "Cool product, very high quality"),
            Product("Shirt 4", "$14", "shirt4", "Cool product, very high quality"),
            Product("Shirt 1", "$10", "shirt1", "Cool product, very high quality"),
            Product("Shirt 2", "$12", "shirt2", "Cool product, very high quality"),
            Product("Shirt 3", "$15", "shirt3", "Cool product, very high quality"),
            Product("Shirt 4", "$14", "shirt4", "Cool product, very high quality"),
            Product("Shirt 1", "$10", "shirt1", "Cool product, very high quality"),
            Product("Shirt 2", "$12", "shirt2", "Cool product, very high quality"),
            Product("Shirt 3", "$15", "shirt3", "Cool product, very high quality"),
            Product("Shirt 4", "$14", "shirt4", "Cool product, very high quality")
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
