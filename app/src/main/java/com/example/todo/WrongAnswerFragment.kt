package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todo.databinding.FragmentWrongAnswerBinding

class WrongAnswerFragment : Fragment() {
    private lateinit var binding: FragmentWrongAnswerBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWrongAnswerBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.button.setOnClickListener {
            findNavController().navigate(WrongAnswerFragmentDirections.actionWrongAnswerFragmentToQuestionOneFragment())
        }
        return view
    }
}