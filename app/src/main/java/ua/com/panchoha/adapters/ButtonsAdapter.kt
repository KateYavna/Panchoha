package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.Callback
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder
import ua.com.panchoha.data.Button

class ButtonsAdapter(val context: Context, var buttons : ArrayList<Button>, val callback: Callback) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_button, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.button.text = context.resources.getString(buttons[position].name)
        holder.button.setOnClickListener { callback.onItemSelected(position) }
    }

    override fun getItemCount(): Int {
     return buttons.size
    }
}