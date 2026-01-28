package com.coderroots.kotlinbatch6m2026

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coderroots.kotlinbatch6m2026.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentBinding
    lateinit var setName: SetName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnSubmit.setOnClickListener{
            if(binding.etName.text.toString().isEmpty()){
                binding.etName.error = "Enter Name"
            }else{
                setName.setName(binding.etName.text.toString())
            }
        }
    }
}