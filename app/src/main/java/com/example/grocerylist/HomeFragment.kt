package com.example.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grocerylist.databinding.FragmentHomeBinding
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController



class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding= FragmentHomeBinding.inflate(inflater, container, false)
        val rootView = binding.root

        binding.startListButton.setOnClickListener{
            val userName = binding.editName.text.toString()
            val action = HomeFragmentDirections.actionHomeFragmentToGroceryListFragment(userName)
            rootView.findNavController().navigate(action)
        }

        return rootView
    }
}