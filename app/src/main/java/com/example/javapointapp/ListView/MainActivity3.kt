package com.example.javapointapp.ListView

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.javapointapp.R
import com.example.javapointapp.databinding.ActivityMain2Binding
import com.example.javapointapp.databinding.ActivityMain3Binding

private lateinit var binding: ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMain3Binding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

/*
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.custom_toast, null) as LinearLayout
 */
        val inflater = layoutInflater
        val layout = inflater.inflate(R.layout.mylist, null) as LinearLayout

        val listItem = resources.getStringArray(R.array.array_technology)

        val adapter : ArrayAdapter<String> = ArrayAdapter(this@MainActivity3,android.R.layout.simple_list_item_1, android.R.id.text1, listItem )
        binding.listView.adapter = adapter

        binding.listView.setOnItemClickListener { parent, view, position, id ->
            val str_value = adapter.getItem(position)
            Toast.makeText(applicationContext,str_value, Toast.LENGTH_SHORT).show()
        }
    }
}