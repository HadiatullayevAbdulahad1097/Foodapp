package developer.abdulahad.foodapp.Cashe

import android.content.Context
import android.content.SharedPreferences
import developer.abdulahad.foodapp.models.Food
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object MySharedPreference {
    private const val NAME = "KeshXotiraga"
    private const val MODE = Context.MODE_PRIVATE
    private lateinit var preferences: SharedPreferences

    fun init(context: Context) {
        preferences = context.getSharedPreferences(NAME, MODE)
    }

    private inline fun SharedPreferences.edit(operation: (SharedPreferences.Editor) -> Unit) {
        val editor = edit()
        operation(editor)
        editor.apply()
    }

    var obektString: ArrayList<Food>
        get() = gsonStringToArray(preferences.getString("obekt", "[]")!!)
        set(value) = preferences.edit {
            it.putString("obekt", arrayToGsonString(value))
        }

    fun arrayToGsonString(arrayList: ArrayList<Food>): String {
        return Gson().toJson(arrayList)
    }

    fun gsonStringToArray(gsonString: String): ArrayList<Food> {
        val typeToken = object : TypeToken<ArrayList<Food>>() {}.type
        return Gson().fromJson(gsonString, typeToken)
    }
}