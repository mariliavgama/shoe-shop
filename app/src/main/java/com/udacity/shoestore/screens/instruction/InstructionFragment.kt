package com.udacity.shoestore.screens.instruction

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionBinding
import androidx.navigation.fragment.findNavController

/**
 * Instruction fragment.
 */
class InstructionFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentInstructionBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_instruction, container, false)

        binding.showShoeListButton.setOnClickListener {
            findNavController().navigate(InstructionFragmentDirections.actionInstructionToShoeList())
        }

        return binding.root
    }
}