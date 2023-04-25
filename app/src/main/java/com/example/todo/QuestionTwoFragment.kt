package com.example.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.todo.databinding.FragmentQuestionTwoBinding

class QuestionTwoFragment : Fragment() {
    private lateinit var binding: FragmentQuestionTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestionTwoBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.radioGroup2.setOnCheckedChangeListener{ _, checkedId2 ->
            binding.buttonNext2.setOnClickListener {
                when(checkedId2){
                R.id.radioButton3 ->  findNavController().navigate(QuestionTwoFragmentDirections.actionQuestionTwoFragmentToCongrateFragment())
                R.id.radioButton4 -> findNavController().navigate(QuestionTwoFragmentDirections.actionQuestionTwoFragmentToWrongAnswerFragment())
                }
            }
        }
        return view
    }
}