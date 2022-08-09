package ww.futsimul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ww.futsimul.databinding.ActivityDetails2Binding

class DetailsActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityDetails2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetails2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true)
    }
}