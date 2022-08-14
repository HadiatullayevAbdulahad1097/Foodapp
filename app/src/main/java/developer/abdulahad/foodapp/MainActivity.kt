package developer.abdulahad.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btn_menu.setOnClickListener {
            startActivity(Intent(this, ListFoodActivity::class.java))
        }
        btn_menu_card.setOnClickListener {
            startActivity(Intent(this, ListFoodActivity::class.java))
        }
        btn_menu2_card.setOnClickListener {
            startActivity(Intent(this, AddFoodActivity::class.java))
        }
        btn_menu2.setOnClickListener {
            startActivity(Intent(this, AddFoodActivity::class.java))
        }
    }
}