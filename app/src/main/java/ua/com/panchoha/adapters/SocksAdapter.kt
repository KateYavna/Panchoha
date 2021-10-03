package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Socks

class SocksAdapter(val context: Context, var socks : ArrayList<Socks>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_socks, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photoSocks.setImageResource(socks[position].photo)
        holder.headlineSocks.text = context.resources.getString(socks[position].headline)
        holder.detailsSocks.text = context.resources.getString(socks[position].details)
        holder.priceSocks.text = context.resources.getString(socks[position].price)
        holder.clMainSocks.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return socks.size
    }
}
