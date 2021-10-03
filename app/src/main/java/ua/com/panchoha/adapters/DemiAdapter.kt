package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Demi


class DemiAdapter (val context: Context, val demi : ArrayList<Demi>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(demi[position].photo)
        holder.headline.text = context.resources.getString(demi[position].headline)
        holder.details.text = context.resources.getString(demi[position].details)
        holder.price.text = context.resources.getString(demi[position].price)
        holder.clMain.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
       return demi.size
    }
}