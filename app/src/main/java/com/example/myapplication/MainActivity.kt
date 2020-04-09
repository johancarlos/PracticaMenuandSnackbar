package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*
import kotlinx.android.synthetic.main.toolbar.toolbar

class MainActivity : AppCompatActivity() {
/*
    override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

       Snackbar.make(layoutPrincipal , getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()

   }
*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbar.make(layoutPrincipal, getString(R.string.mensaje_snackbar), Snackbar.LENGTH_LONG).show()

        supportActionBar.let {
            it?.setDisplayHomeAsUpEnabled(true)
            it?.setDisplayShowHomeEnabled(true)
        }

        setContentView(R.layout.activity_main)
        supportActionBar.let {
            setSupportActionBar(toolbar)
        }
        fun selectedButton(view: View){
            if(view.id === R.id.btnService){
                val intent: Intent = Intent(view.context, MainActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(view.context, "Evento no definido", Toast.LENGTH_LONG).show()
            }
        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean{
        when(item!!.itemId){
            R.id.action_search->{
                Log.d("TEST", "ICON SEARCH")
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}