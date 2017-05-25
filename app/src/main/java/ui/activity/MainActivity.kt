package ui.activity

import android.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.danxx.mdplayer.R

class MainActivity : AppCompatActivity()  {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    fun initView(){
        var fragmentTransaction  = supportFragmentManager.beginTransaction()


    }

}
