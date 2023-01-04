package com.example.customfragemt.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.customfragemt.databinding.FragmentSercondBinding

class SercondFragment : Fragment() {
    private var _binding: FragmentSercondBinding?=null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSercondBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }
}