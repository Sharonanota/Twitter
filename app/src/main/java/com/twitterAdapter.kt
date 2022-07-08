package com

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.siara.twitter.R

class twitterAdapter(var twitterlist: List<Contacts>): RecyclerView.Adapter<twitterViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): twitterViewHolder {
            var twitterView = LayoutInflater.from(parent.context).inflate(R.layout.twitter_list_items,parent,false)

            return twitterViewHolder(twitterView)
        }

    override fun onBindViewHolder(holder: twitterViewHolder, position: Int) {
        var currentContact = twitterlist.get(position)
        holder.tvName.text = currentContact.name
        holder.tvProfile.text = currentContact.profile
        holder.tvEmail.text = currentContact.handle
        holder.tvDate.text = currentContact.date
    }

    override fun getItemCount(): Int {
        return twitterlist.size
    }
}
class twitterViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvProfile = itemView.findViewById<TextView>(R.id.tvProfile)
    var tvEmail = itemView.findViewById<TextView>(R.id.tvEmail)
    var tvDate = itemView.findViewById<TextView>(R.id.tvDate)
//    var img1= itemView.findViewById<TextView>(R.id.img1)
//    var img2= itemView.findViewById<TextView>(R.id.img2)
//    var img3= itemView.findViewById<TextView>(R.id.img3)
//    var img4= itemView.findViewById<TextView>(R.id.img4)
//    var img5= itemView.findViewById<TextView>(R.id.img5)

}