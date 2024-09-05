package com.udacity.shoestore.screens.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailBinding

/**
 * Shoe details fragment.
 */
class DetailFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false)

        /*binding.createLoginButton.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginToWelcome())
        }

        binding.loginButton.setOnClickListener {
            findNavController().navigate(LoginFragmentDirections.actionLoginToWelcome())
        }*/

        return binding.root
    }
}