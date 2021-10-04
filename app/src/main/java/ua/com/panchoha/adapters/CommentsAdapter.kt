package ua.com.panchoha.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ua.com.panchoha.R
import ua.com.panchoha.ViewHolder

class CommentsAdapter(val context: Context, var comments : ArrayList<String>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_comment, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.comment.text = comments[position]
    }

    override fun getItemCount(): Int {
      return  comments.size
    }
}