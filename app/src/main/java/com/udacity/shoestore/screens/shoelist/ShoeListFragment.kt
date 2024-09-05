package com.udacity.shoestore.screens.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding

/**
 * ShoeListFragment fragment.
 */
class ShoeListFragment : Fragment() {

    private lateinit var viewModel: ShoeListViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentShoeListBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_shoe_list, container, false)

        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)

        /*binding.playGameButton.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionTitleToGame())
        }*/
        return binding.root
    }
}