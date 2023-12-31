package com.example.Agriforcast.vPagerFragment.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.Agriforcast.R
import com.example.Agriforcast.databinding.FragmentHalamanKeduaBinding

class HalamanKedua:Fragment() {
    private lateinit var binding: FragmentHalamanKeduaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
// Inflate the layout for this fragment
        val view = inflater.inflate(
            R.layout.fragment_halaman_kedua,
            container, false
        )

        binding = FragmentHalamanKeduaBinding.bind(view)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.txtHalNextDua.setOnClickListener {
            viewPager?.currentItem = 2
        }
        return view
    }
}