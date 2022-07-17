package com.example.navigationinandroid

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationinandroid.databinding.ActivityMainBinding
import com.example.navigationinandroid.databinding.FragmentMainMenuBinding

class MainMenu : Fragment() {

    val main = MainActivity()
    var _binding:FragmentMainMenuBinding? = null
    val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainMenuBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.button.setOnClickListener{
            main.btn(binding.button)
        }
        binding.button2.setOnClickListener{
            main.btn(binding.button2)
        }
        binding.button3.setOnClickListener{
            main.btn(binding.button3)
        }
    }
}
