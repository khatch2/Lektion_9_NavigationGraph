package com.example.lektion_9_navigationgraph

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.lektion_9_navigationgraph.databinding.FragmentAboutBinding
import com.example.lektion_9_navigationgraph.databinding.FragmentHomeBinding

class AboutFragment : Fragment() {

    private lateinit var binding: FragmentAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Setup ViewBinding
        binding = FragmentAboutBinding.inflate(layoutInflater, container, false)
        val view = binding.root

        // ID's
        val btnHome = binding.btnHome

        // onClick
        btnHome.setOnClickListener() {
            Navigation.findNavController(view).navigate(R.id.action_aboutFragment_to_homeFragment)
        }

        return view
    }

}