package android.maxim.viewbinding2801

import android.maxim.viewbinding2801.databinding.ActivityMainBinding
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.javafaker.Faker


class MainActivity : AppCompatActivity() {

    private val faker = Faker.instance()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.button.setOnClickListener { newQuote() }
        setContentView(binding.root)

    }

    private fun newQuote() {
        binding.textView.text = faker.gameOfThrones().quote()
    }
}