package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todo.databinding.FragmentQuestionOneBinding

class QuestionOneFragment : Fragment() {
    private lateinit var binding: FragmentQuestionOneBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionOneBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.radioGroup1.setOnCheckedChangeListener{ _, checkedId ->
            when(checkedId){
                R.id.radioButton1 ->
                    binding.textView2.text ="correct answer"
                R.id.radioButton2 -> findNavController().navigate(QuestionOneFragmentDirections.actionQuestionOneFragmentToWrongAnswerFragment())
            }
            binding.buttonNext1.setOnClickListener {
                findNavController().navigate(QuestionOneFragmentDirections.actionQuestionOneFragmentToQuestionTwoFragment()) }
        }
        return view
    }
}