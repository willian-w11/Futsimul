package ww.futsimul

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ww.futsimul.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    //setContentView(R.layout.activity_main)
       //val tvHello = findViewById<TextView>(R.id.tvHello)

       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvHello.text = "É gooooolll"
    }
}