package com.example.Agriforcast.vPagerFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.Agriforcast.R
import com.example.Agriforcast.databinding.FragmentViewPagerBinding
import com.example.Agriforcast.vPagerFragment.screens.HalamanKedua
import com.example.Agriforcast.vPagerFragment.screens.HalamanKetiga
import com.example.Agriforcast.vPagerFragment.screens.HalamanPertama


class ViewPagerFragment : Fragment() {
    lateinit var binding: FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)
        binding = FragmentViewPagerBinding.bind(view)
        val fragmentList = arrayListOf(
            HalamanPertama(),
            HalamanKedua(),
            HalamanKetiga()
        )
        val adapter = ViewPagerAdapter(fragmentList,
            requireActivity().supportFragmentManager, lifecycle)
        binding.viewPager.adapter = adapter
        return view
    }
}