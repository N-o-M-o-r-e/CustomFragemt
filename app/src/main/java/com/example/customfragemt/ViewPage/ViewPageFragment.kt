package com.example.customfragemt.ViewPage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.customfragemt.Fragment.FirstFragment
import com.example.customfragemt.Fragment.SercondFragment
import com.example.customfragemt.Fragment.ThirtFragment
import com.example.customfragemt.databinding.FragmentViewPageBinding


class ViewPageFragment : Fragment() {
    private var _binding: FragmentViewPageBinding? = null
    private lateinit var viewPager:ViewPager2
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentViewPageBinding.inflate(inflater, container, false)
        val view = binding.root

        val fragmentList = arrayListOf(
            FirstFragment(),
            SercondFragment(),
            ThirtFragment(),
        )
        val adapter = ViewPageAdapter(fragmentList, requireActivity().supportFragmentManager,lifecycle)

        viewPager = binding.viewPage
        binding.viewPage.adapter = adapter

        binding.button.setOnClickListener {
            val currentItem = binding.viewPage.currentItem + 1
            binding.viewPage.currentItem = currentItem
        }

        binding.dotsIndicator.attachTo(viewPager)


        return view
    }


}