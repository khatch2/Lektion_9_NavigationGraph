package com.example.lektion_9_navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lektion_9_navigationgraph.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // Initialize Viewbinding
    private lateinit var binding: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Setup ViewBinding
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        // ID's
        val btnAbout = binding.btnAbout

        // onClick
        btnAbout.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_aboutFragment)
        }

        return view

    }

}