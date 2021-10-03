package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Stockings

class StockingsAdapter (val context: Context, var stockings : ArrayList<Stockings>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(stockings[position].photo)
        holder.headline.text = context.resources.getString(stockings[position].headline)
        holder.details.text = context.resources.getString(stockings[position].details)
        holder.price.text = context.resources.getString(stockings[position].price)
        holder.clMain.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return stockings.size
    }
}
