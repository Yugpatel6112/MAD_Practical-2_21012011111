package com.example.mad_practical_2_21012011111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Constraint
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate method is call")
    }
    fun showMessage(message:String){
        Log.i(TAG, message)
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val v:ConstraintLayout=findViewById(R.id.myconstraintlayout)
        if (v!=null) {
            Snackbar.make(
                v,
                message, Snackbar.LENGTH_SHORT
            ).show()
        }
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart method is call")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume method is call")
    }
    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart method is call")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause method is call")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop method is call")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy method is call")
    }

}