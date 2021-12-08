package com.kolin.applicationfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

private const val TAG = "MyTag"

class MainActivity : AppCompatActivity() {

    lateinit var switchFragmentsButton : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        switchFragmentsButton = findViewById(R.id.switch_fragment_button)

        Log.d(TAG,"MainActivity - onCreate")

        val startFragment = StartFragment()
        val endFragment = EndFragment()
        switchFragmentsButton.setOnClickListener {
            val fragment =
                when (supportFragmentManager.findFragmentById(R.id.fragment_container)){
                    is StartFragment-> endFragment
                    is EndFragment->startFragment
                    else ->startFragment
                }
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container,fragment)
                .addToBackStack(fragment.tag)
                .commit()
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity - onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity - onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"MainActivity - onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"MainActivity - onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"MainActivity - onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"MainActivity - onDestroy")


    }

}