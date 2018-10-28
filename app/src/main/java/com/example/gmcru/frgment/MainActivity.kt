package com.example.gmcru.frgment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.gmcru.frgment.exts.putFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        button.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.mainContainer,MainFragment.instance()).commit()
           // supportFragmentManager.beginTransaction().replace(R.id.main,MainFragment.instance())
        }

    }
}
