package com.renatougaz.simplefinancetracker.ui.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
//import com.renatougaz.simplefinancetracker.databinding.FragmentDashboardBinding
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
            ViewModelProvider(this).get(DetailsViewModel::class.java)

        _binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val currentDebtEditText: EditText = binding.floatInputEditText

//        var currentDebt : Float = 0.0f
//
//        detailsViewModel.currentDebt.observe(viewLifecycleOwner) {
//            currentDebt = currentDebtEditText.text.toString().toFloat()
//        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}