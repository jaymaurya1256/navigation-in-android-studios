package com.example.navigationinandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.navigationinandroid.databinding.FragmentSubMenu1Binding


class SubMenu1 : Fragment() {
    private lateinit var binding: FragmentSubMenu1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSubMenu1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button4.setOnClickListener{
            findNavController().navigate(R.id.action_subMenu1_to_mainMenu)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
    }
}
