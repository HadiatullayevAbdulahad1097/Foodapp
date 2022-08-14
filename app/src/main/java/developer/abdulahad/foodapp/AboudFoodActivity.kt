package developer.abdulahad.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import developer.abdulahad.foodapp.Cashe.MySharedPreference
import kotlinx.android.synthetic.main.activity_aboud_food.*

class AboudFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboud_food)
        supportActionBar?.hide()

        MySharedPreference.init(this)
        val list = MySharedPreference.obektString



        val position = intent.getIntExtra("position",0)
        txt_name.text = list[position].name
        txt_food_product.text = list[position].ingredient
        txt_preparation_order.text = list[position].preparationOrder
    }
}