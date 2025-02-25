package com.example.projekakhir

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projekakhir.databinding.FragmentBerkasPendaftaranBinding

class BerkasPendaftaranFragment : Fragment() {

    private lateinit var binding: FragmentBerkasPendaftaranBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBerkasPendaftaranBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.logoutps.setOnClickListener {
            findNavController().navigate(R.id.action_berkasPendaftaranFragment_to_loginFragment)
        }
        binding.menups.setOnClickListener {
            findNavController().navigate(R.id.action_berkasPendaftaranFragment_to_menuDashboardFragment)
        }

    }

}