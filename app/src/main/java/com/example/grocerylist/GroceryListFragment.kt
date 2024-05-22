package com.example.grocerylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.grocerylist.databinding.FragmentGroceryListBinding
import androidx.fragment.app.setFragmentResultListener
import androidx.navigation.findNavController

//declaring mutableList
class GroceryListFragment : Fragment() {
    private var _binding: FragmentGroceryListBinding? = null
    private val binding get() = _binding!!
    private var itemNum = 0
    val itemsInList = mutableListOf<String>()
    lateinit var displayList: List<TextView>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGroceryListBinding.inflate(inflater, container, false)
        val rootView = binding.root
        displayList = listOf(
            binding.groceryItem1,
            binding.groceryItem2,
            binding.groceryItem3,
            binding.groceryItem4,
            binding.groceryItem5
        )
        val args = GroceryListFragmentArgs.fromBundle(requireArguments())
        binding.welcomeName.text = "Welcome ${args.userNameArg}"

        binding.addItemButton.setOnClickListener {
            val action =
                GroceryListFragmentDirections.actionGroceryListFragmentToChooseItemFragment()
            rootView.findNavController().navigate(action)
        }
        setFragmentResultListener("REQUESTING_ITEMS_IN_LIST_KEY") { requestKey: String, bundle: Bundle ->
            val itemName = bundle.getString("ITEMS_IN_LIST_KEY")
            if (!itemsInList.contains(itemName) && itemNum < 5) {
                if (itemName != null) {
                    itemsInList.add(itemName) ///change for no nullabe
                    itemNum++
                }
            }
            var countForReadding = 0
            for (x in itemsInList) {
                displayList[countForReadding].text = x
                countForReadding++
            }
        }
        return rootView
    }
}