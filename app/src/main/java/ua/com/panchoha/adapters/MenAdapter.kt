package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Men

class MenAdapter (val context: Context, var men : ArrayList<Men>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_socks, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photoSocks.setImageResource(men[position].photo)
        holder.headlineSocks.text = context.resources.getString(men[position].headline)
        holder.detailsSocks.text = context.resources.getString(men[position].details)
        holder.priceSocks.text = context.resources.getString(men[position].price)
        holder.clMainSocks.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return men.size
    }
}