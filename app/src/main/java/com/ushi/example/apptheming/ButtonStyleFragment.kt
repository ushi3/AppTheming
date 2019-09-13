package com.ushi.example.apptheming

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ushi.example.apptheming.databinding.FragmentButtonStyleBinding

class ButtonStyleFragment : Fragment() {

    private lateinit var binding: FragmentButtonStyleBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentButtonStyleBinding.inflate(inflater, container, false)
        return binding.root
    }
}
