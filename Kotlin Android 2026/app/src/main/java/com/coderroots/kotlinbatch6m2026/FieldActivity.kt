package com.coderroots.kotlinbatch6m2026

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coderroots.kotlinbatch6m2026.databinding.FiledActivityBinding
import com.google.android.material.button.MaterialButton

class FieldActivity : AppCompatActivity() { // Independent Activity
//   lateinit var etEmail : EditText
//   lateinit var btnSubmit: MaterialButton
lateinit var binding : FiledActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = FiledActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

//        etEmail = findViewById(R.id.etEmail)
//        btnSubmit = findViewById(R.id.btnSubmit)

        intent.let {
            binding.etEmail.setText(it.getStringExtra("name").toString())

        }

        binding.btnSubmit.setOnClickListener {
            //validation
            if(binding.etEmail.text.toString().isEmpty()){
                binding.etEmail.error = "Enter Name"
            }else{
                Toast.makeText(this,"Name Submit", Toast.LENGTH_SHORT).show()
            }
        }
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this,"onStart", Toast.LENGTH_SHORT).show()

    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Toast.makeText(this,"onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this,"onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this,"onDestroy", Toast.LENGTH_SHORT).show()
    }
}