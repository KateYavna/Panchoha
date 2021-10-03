package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Fashion
import ua.com.panchoha.data.Kids

class FashionAdapter(val context: Context, var fashion : ArrayList<Fashion>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(fashion[position].photo)
        holder.headline.text = context.resources.getString(fashion[position].headline)
        holder.details.text = context.resources.getString(fashion[position].details)
        holder.price.text = context.resources.getString(fashion[position].price)
        holder.clMain.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return fashion.size
    }
}