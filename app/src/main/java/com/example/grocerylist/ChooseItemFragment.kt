package com.example.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.setFragmentResult
import com.example.grocerylist.databinding.FragmentChooseItemBinding
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController



private var _binding: FragmentChooseItemBinding? = null
private val binding get() = _binding!!

class ChooseItemFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentChooseItemBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.almondButterButton.setOnClickListener {
            val itemName = binding.almondButterButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.oatmealButton.setOnClickListener {
            val itemName = binding.oatmealButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.darkChocolateButton.setOnClickListener {
            val itemName = binding.darkChocolateButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.avocadoButton.setOnClickListener {
            val itemName = binding.avocadoButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.kaleButton.setOnClickListener {
            val itemName = binding.kaleButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.blueberriesButton.setOnClickListener {
            val itemName = binding.blueberriesButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.kombuchaButton.setOnClickListener {
            val itemName = binding.kombuchaButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }
        binding.appleCiderButton.setOnClickListener {
            val itemName = binding.appleCiderButton.getText()
            setFragmentResult("REQUESTING_ITEMS_IN_LIST_KEY", bundleOf("ITEMS_IN_LIST_KEY" to itemName))
            rootView.findNavController().navigateUp()
        }




        return rootView
    }
}