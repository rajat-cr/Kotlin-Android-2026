package com.coderroots.kotlinbatch6m2026

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.coderroots.kotlinbatch6m2026.databinding.ActivityFragmentRajatBinding

class FragmentRajatActivity : AppCompatActivity() {
    lateinit var binding: ActivityFragmentRajatBinding
    lateinit var setName: SetName // in Activity only declare the interface
    var i =0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityFragmentRajatBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnSubmit.setOnClickListener {
            i = i+1
            setName.increment(i)
        }
    }
}