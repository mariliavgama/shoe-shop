package com.udacity.shoestore.screens.shoelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuProvider
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
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

        binding.fab.setOnClickListener {
            findNavController().navigate(ShoeListFragmentDirections.actionShoeListToDetail())
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.shoe_list_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        findNavController().navigate(ShoeListFragmentDirections.actionShoeListToLogin())
        return NavigationUI.onNavDestinationSelected(item, requireView().findNavController())
                || super.onOptionsItemSelected(item)
    }
}