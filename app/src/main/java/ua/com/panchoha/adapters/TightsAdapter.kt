package ua.com.panchoha

import android.content.Context
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_button.view.*
import kotlinx.android.synthetic.main.item_comment.view.*
import kotlinx.android.synthetic.main.item_goods.view.*
import kotlinx.android.synthetic.main.item_socks.view.*
import ua.com.panchoha.data.Tights


class TightsAdapter(val context: Context, var tights : ArrayList<Tights>, val callback :Callback) : RecyclerView.Adapter<ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_goods, parent, false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.photo.setImageResource(tights[position].photo)
        holder.headline.text = context.resources.getString(tights[position].headline)
        holder.details.text = context.resources.getString(tights[position].details)
        holder.price.text = context.resources.getString(tights[position].price)
        holder.clMain.setOnClickListener {

            callback.onItemSelected(position) }
    }

    override fun getItemCount(): Int {
        return tights.size
    }


}
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var photo = itemView.ivPhoto
        var photoSocks = itemView.ivPhotoSocks
        var headline = itemView.tvHeadline
        var headlineSocks = itemView.tvHeadlineSocks
        var details = itemView.tvDetails
        var detailsSocks = itemView.tvDetailsSocks
        var price = itemView.tvPrice
        var priceSocks = itemView.tvPriceSocks
        var clMain = itemView.clMain
        var clMainSocks = itemView.clMainSocks
        var button = itemView.btButton
        var comment = itemView.tvItemComment
}
interface Callback {
    fun onItemSelected(index:Int)

}