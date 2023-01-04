package com.example.customfragemt.ViewPage

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.customfragemt.Fragment.FirstFragment
import com.example.customfragemt.Fragment.SercondFragment
import com.example.customfragemt.Fragment.ThirtFragment

class ViewPageAdapter (list: ArrayList<Fragment>, fm: FragmentManager, lifecycle: Lifecycle):FragmentStateAdapter(fm,lifecycle) {
    private val fragmentList: ArrayList<Fragment> = list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0->{
                return FirstFragment()
            }
            1->{
                return SercondFragment()
            }
            2->{
                return ThirtFragment()
            }
            else ->{
                return FirstFragment()
            }
        }
    }

}