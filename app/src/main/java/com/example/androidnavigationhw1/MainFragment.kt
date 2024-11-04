package com.example.androidnavigationhw1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.androidnavigationhw1.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.redButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_redFragment)
        }

        binding.greenButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_greenFragment)
        }

        binding.yellowButton.setOnClickListener{
            view.findNavController().navigate(R.id.action_mainFragment_to_yellowFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}