package com.example.navigationinandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.example.navigationinandroid.databinding.ActivityMainBinding
import com.example.navigationinandroid.databinding.FragmentMainMenuBinding

class MainMenu : Fragment() {


    private lateinit var binding: FragmentMainMenuBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener{
            findNavController().navigate(R.id.action_mainMenu_to_subMenu1)
        }
        binding.button2.setOnClickListener{
            findNavController().navigate(R.id.action_mainMenu_to_subMenu2)
        }
        binding.button3.setOnClickListener{
            findNavController().navigate(R.id.action_mainMenu_to_subMenu3)
        }
    }
}
