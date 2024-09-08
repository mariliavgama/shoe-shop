package com.udacity.shoestore.screens.detail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentDetailBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.screens.shoelist.ShoeViewModel

/**
 * Shoe details fragment.
 */
class DetailFragment : Fragment() {

    private val shoeViewModel: ShoeViewModel by activityViewModels()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        // Inflate the layout for this fragment
        val binding: FragmentDetailBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_detail, container, false)

        binding.saveButton.setOnClickListener {
            val name = binding.shoeName
            val size = binding.shoeSize
            val company = binding.shoeCompany
            val description = binding.shoeDescription

            if (name.isNullOrEmpty() || size.isNullOrEmpty() || company.isNullOrEmpty() || description.isNullOrEmpty()) {
                Toast.makeText(context, R.string.empty_fields_error, Toast.LENGTH_LONG).show()
            } else {
                saveShoe(Shoe(name, size.toDouble(), company, description))
            }
        }

        binding.cancelButton.setOnClickListener {
            findNavController().navigate(DetailFragmentDirections.actionDetailToShoeList())
        }

        return binding.root
    }

    private fun saveShoe(newShoe: Shoe) {
        shoeViewModel.addShoe(newShoe)
        findNavController().navigate(DetailFragmentDirections.actionDetailToShoeList())
    }
}