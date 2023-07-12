package com.example.optionmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId){
            R.id.delete -> Toast.makeText(this, "Delete selected", Toast.LENGTH_SHORT).show()
            R.id.back -> Toast.makeText(this, "Back", Toast.LENGTH_SHORT).show()
            R.id.menu -> Toast.makeText(this, "Menu", Toast.LENGTH_SHORT).show()

        }
        return super.onOptionsItemSelected(item)
    }
}