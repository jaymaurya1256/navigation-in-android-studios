package com.example.navigationinandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationinandroid.databinding.FragmentSubMenu2Binding

class SubMenu2 : Fragment() {
    private lateinit var binding:FragmentSubMenu2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSubMenu2Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button5.setOnClickListener{
            findNavController().navigate(R.id.action_subMenu2_to_mainMenu)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}