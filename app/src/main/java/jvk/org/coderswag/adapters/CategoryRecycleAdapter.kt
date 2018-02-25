package jvk.org.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import jvk.org.coderswag.R
import jvk.org.coderswag.model.Category

class CategoryRecycleAdapter(private val context: Context,
                             private val categories: List<Category>,
                             private val itemClick: (Category) -> Unit) :
        RecyclerView.Adapter<CategoryRecycleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(this.context)
                .inflate(R.layout.category_list_item, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return this.categories.count()
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.bindCategory(this.categories[position], this.context)
    }

    inner class ViewHolder(itemView: View?, private val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {
        private val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        private val categoryName = itemView?.findViewById<TextView>(R.id.categoryTitle)

        fun bindCategory(category: Category, context: Context) {
            val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            this.categoryImage?.setImageResource(resourceId)
            this.categoryName?.text = category.title
            itemView.setOnClickListener { this.itemClick(category) }
        }

    }
}
