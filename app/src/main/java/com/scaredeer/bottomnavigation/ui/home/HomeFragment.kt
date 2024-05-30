package com.scaredeer.bottomnavigation.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.scaredeer.bottomnavigation.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // This property (binding / _binding) is only valid between onCreateView and onDestroyView.
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        /*
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        homeViewModel.text.observe(viewLifecycleOwner) {
            binding.textHome.text = it
        }*/

        binding.btnConvertir.setOnClickListener {
            if (binding.inputC.text.toString().toInt() > 0){
                var grados = binding.inputC.text.toString().toDouble()
                val conversion = grados * 9 / 5 + 32

                binding.resConversion.text = conversion.toString()
            }
        }

        return binding.root
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}