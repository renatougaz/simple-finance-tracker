package com.renatougaz.simplefinancetracker.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.renatougaz.simplefinancetracker.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment() {

    private var _binding: FragmentDetailsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val detailsViewModel =
            ViewModelProvider(this)[DetailsViewModel::class.java]

        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // Connect the ViewModel to the layout's viewModel variable
        binding.viewModel = detailsViewModel
        // Enable LiveData observation in the layout
        binding.lifecycleOwner = viewLifecycleOwner

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}