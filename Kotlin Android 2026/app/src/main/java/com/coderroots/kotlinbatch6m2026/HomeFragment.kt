package com.coderroots.kotlinbatch6m2026

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coderroots.kotlinbatch6m2026.databinding.FragmentHomeBinding


class HomeFragment : Fragment(), SetName {
    lateinit var binding: FragmentHomeBinding
    lateinit var fragmentActivity: FragmentActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentHomeBinding.inflate(layoutInflater)
        fragmentActivity = activity as FragmentActivity
        fragmentActivity.setName = this
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun setName(name: String) {
        binding.tvName.text = name
    }

    override fun increment(count: Int) {

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            HomeFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}