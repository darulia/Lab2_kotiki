package com.example.example

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.example.databinding.ActivitySecondBinding

class SecondActivity : Fragment() {


    lateinit var binding: ActivitySecondBinding
    lateinit var adapter: CatAdapter
    val navController by lazy { findNavController() }
    private var catDesc: String? = null
    private var catName: String? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = ActivitySecondBinding.inflate(layoutInflater, container, false)
        return binding.root


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            catDesc = it.getString("myTextView")
            catName = it.getString("myTextView2")
        }
        binding.textView.text = catDesc
        binding.textView2.text = catName

    }

}