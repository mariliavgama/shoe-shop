package com.udacity.shoestore.screens.shoelist

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ItemShoeBinding
import com.udacity.shoestore.models.Shoe

class ShoeItemView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    // Inflate the layout for the custom view
    private var binding: ItemShoeBinding = DataBindingUtil.inflate(
        LayoutInflater.from(context),
        R.layout.item_shoe,
        this,
        true
    )

    fun setShoe(shoe: Shoe) {
        binding.shoe = shoe
        binding.executePendingBindings()
    }
}