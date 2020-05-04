package com.example.mathkotlin

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var s = ""
    companion object {
        val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT"
    }
    //const val EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Add.setOnClickListener {
            s = "Add"
            val intent: Intent = Intent(applicationContext, ProblemsPage::class.java)
            intent.putExtra(EXTRA_TEXT, s)
            startActivity(intent)
        }
        Subtract.setOnClickListener{
            s = "Subtract"
            val intent: Intent = Intent(applicationContext, ProblemsPage::class.java)
            intent.putExtra(EXTRA_TEXT, s)
            startActivity(intent)
        }
        Multiply.setOnClickListener{
            s = "Multiply"
            val intent: Intent = Intent(applicationContext, ProblemsPage::class.java)
            intent.putExtra(EXTRA_TEXT, s)
            startActivity(intent)
        }
        Divide.setOnClickListener {
            s = "Divide"
            val intent: Intent = Intent(applicationContext, ProblemsPage::class.java)
            intent.putExtra(EXTRA_TEXT, s)
            startActivity(intent)
        }
        Mix.setOnClickListener{
            s = "Mix"
            val intent: Intent = Intent(applicationContext, ProblemsPage::class.java)
            intent.putExtra(EXTRA_TEXT, s)
            startActivity(intent)
        }
    }


}
