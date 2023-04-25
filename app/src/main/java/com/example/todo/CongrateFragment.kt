package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todo.databinding.FragmentCongrateBinding

class CongrateFragment : Fragment() {
    private lateinit var binding: FragmentCongrateBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCongrateBinding.inflate(inflater, container, false)
        binding.button2.setOnClickListener {
            findNavController().navigate(CongrateFragmentDirections.actionCongrateFragmentToHomeFragment())
        }
        return binding.root
    }
}