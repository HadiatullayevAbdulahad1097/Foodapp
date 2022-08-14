package developer.abdulahad.foodapp

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import developer.abdulahad.foodapp.Adapter.MyAdapter
import developer.abdulahad.foodapp.Cashe.MySharedPreference
import kotlinx.android.synthetic.main.activity_list_food.*

class ListFoodActivity : AppCompatActivity() {
    lateinit var myAdapter: MyAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_food)
        title = "Barcha Taomlar"

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString

        myAdapter = MyAdapter(this, list)
        list_food.adapter = myAdapter
        
        list_food.setOnItemClickListener { adapterView, view, i, l ->
            val intent = Intent(this, AboudFoodActivity::class.java)
            intent.putExtra("position", i)
            startActivity(intent)
        }
    }
}