package developer.abdulahad.foodapp.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import developer.abdulahad.foodapp.models.Food
import developer.abdulahad.foodapp.R
import kotlinx.android.synthetic.main.item_rv.view.*

class MyAdapter(context : Context, var  list : List<Food>) : ArrayAdapter<Food>(context, R.layout.item_rv, list) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup) : View {

        var itemView:View

        if (convertView == null){
            itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_rv , parent , false)
        }else{
            itemView = convertView
        }

        itemView.txt_name.text = list[position].name

        return itemView
    }
}