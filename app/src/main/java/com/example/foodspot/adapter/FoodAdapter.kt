package com.example.foodspot.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodspot.R
import com.example.foodspot.data.model.Food

class FoodAdapter(
    private val dataset: List<Food>
) : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    // IDEE EINES VIEWHOLDERS
    // der ViewHolder weiß welche Teile des Layouts beim Recycling angepasst werden
    class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val foodImage = view.findViewById<ImageView>(R.id.food_image)
        val foodTitle = view.findViewById<TextView>(R.id.food_name_text)
        val foodRating = view.findViewById<TextView>(R.id.food_rating_text)
        val foodDescription = view.findViewById<TextView>(R.id.food_description_text)
        val foodRecipe = view.findViewById<TextView>(R.id.food_recipe_text)
    }

    // ERSTELLEN DES VIEWHOLDERS
    // hier werden neue ViewHolder erstellt
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.food_item, parent, false)

        return ViewHolder(adapterLayout)
    }

    // BEFÜLLEN DES VIEWHOLDERS
    // hier findet der Recyclingprozess statt
    // die vom ViewHolder bereitgestellten Parameter werden verändert
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = dataset[position]
        holder.foodImage.setImageResource(food.imageResource)
        holder.foodTitle.text = food.title
        holder.foodRating.text = food.rating.toString()
        holder.foodDescription.text = food.description
        holder.foodRecipe.text = food.recipe
    }

    // damit der LayoutManager weiß wie lang die Liste ist
    override fun getItemCount(): Int {
        return dataset.size
    }
}