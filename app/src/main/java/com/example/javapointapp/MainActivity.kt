package com.example.javapointapp

import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.javapointapp.ListView.MainActivity3
import com.example.javapointapp.databinding.ActivityMainBinding
import com.example.javapointapp.implicitintent.MainActivity2


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {// on create the end
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    /*// ikinci aktiviteye gider
            intent = Intent(applicationContext, SecondActivity::class.java)
        startActivity(intent)
     */

/* // bir url'e bizi yonlendirir
    intent = Intent(Intent.ACTION_VIEW)
    intent.setData(Uri.parse("https://www.javatpoint.com/"))
    startActivity(intent)
 */

    val id = 10
    val language = "kotlin"

    binding.button.setOnClickListener {
        intent = Intent(this@MainActivity, SecondActivity::class.java)
        intent.putExtra("id_value", id)
        intent.putExtra("language_value",language)
        startActivity(intent)
    }



    // acildiginda direkt o sinifa gitsin, manifestten her ornek icin
    // baslangic activity'sini degistirmek yerine boyle bir cozum buldum
    intent = Intent(this@MainActivity, MainActivity3::class.java)
    startActivity(intent)

}// on create fonksiyonu


}



