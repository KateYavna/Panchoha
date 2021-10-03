package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Winter

class WinterAdapter(val context: Context, val winter : ArrayList<Winter>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(winter[position].photo)
        holder.headline.text = context.resources.getString(winter[position].headline)
        holder.details.text = context.resources.getString(winter[position].details)
        holder.price.text = context.resources.getString(winter[position].price)
        holder.clMain.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
       return winter.size
    }
}