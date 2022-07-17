package com.example.navigationinandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    var intbtn:Int? = null
    private lateinit var navController: NavController
    fun btn(button: Button)
    {
        var int:Int? = null
        if (button.text.toString() == "SubMenu1"){int = 1}
        if (button.text.toString() == "SubMenu2"){int = 2}
        else{int = 3}
        intbtn = int
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView)
                as NavHostFragment

        when(intbtn){
            1 -> {navController = navHostFragment.navController
                    val action = MainMenuDirections.actionMainMenuToSubMenu1()
                    return navController.navigate(action)}
            2 -> { navController = navHostFragment.navController
                       val action = MainMenuDirections.actionMainMenuToSubMenu2()
                       return navController.navigate(action) }
            3 -> {navController = navHostFragment.navController
                  val action = MainMenuDirections.actionMainMenuToSubMenu3()
                  return navController.navigate(action) }
        }
    }

}