package developer.abdulahad.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import developer.abdulahad.foodapp.Cashe.MySharedPreference
import developer.abdulahad.foodapp.models.Food
import kotlinx.android.synthetic.main.activity_add_food.*

class AddFoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_food)
        title = "Taom Qoshish"

        MySharedPreference.init(this)

        btn_save.setOnClickListener {
            val name = edt_food_name.text.toString().trim()
            val products = edt_food_products.text.toString().trim()
            val preparationorder = edt_preparation_order.text.toString().trim()

            if (name != "" && products != "" && preparationorder != ""){
                val list = MySharedPreference.obektString
                list.add(Food(name,products,preparationorder))
                MySharedPreference.obektString = list
                Toast.makeText(this, "Save", Toast.LENGTH_SHORT).show()
                finish()
            }else{
                Toast.makeText(this, "IsEmpty", Toast.LENGTH_SHORT).show()
            }
        }
    }
}