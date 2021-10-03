package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Kids

class KidsAdapter(val context: Context, var kids : ArrayList<Kids>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_socks, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photoSocks.setImageResource(kids[position].photo)
        holder.headlineSocks.text = context.resources.getString(kids[position].headline)
        holder.detailsSocks.text = context.resources.getString(kids[position].details)
        holder.priceSocks.text = context.resources.getString(kids[position].price)
        holder.clMainSocks.setOnClickListener {
            callback.onItemSelected(position)
        }
    }

    override fun getItemCount(): Int {
        return kids.size
    }
}