package com.example.javapointapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.javapointapp.databinding.ActivitySecondBinding

private lateinit var binding: ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivitySecondBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        /*
        Explicit Intent: This intent satisfies the request within the application component.
        It takes the fully qualified class name of activities or services that we want to start.
         */

        val bundle:Bundle? = intent.extras

        bundle?.let {
            val language = bundle.getString("language_value","degiskenGelmedi")
            val id = bundle.getInt("id_value", -1)

            Toast.makeText(applicationContext, "ID: "+id.toString()+ ", Language: "+language, Toast.LENGTH_LONG).show()


            binding.button2.setOnClickListener {
                intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent)
            }

        }












    }// the end of the on create
}