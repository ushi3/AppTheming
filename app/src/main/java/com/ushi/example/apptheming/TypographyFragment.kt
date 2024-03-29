package com.ushi.example.apptheming

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.ushi.example.apptheming.databinding.FragmentTypographyBinding

class TypographyFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentTypographyBinding.inflate(inflater, container, false).root
    }

}
