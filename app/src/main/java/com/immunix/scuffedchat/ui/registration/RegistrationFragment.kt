package com.immunix.scuffedchat.ui.registration

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.immunix.scuffedchat.R
import com.immunix.scuffedchat.databinding.FragmentRegistrationBinding

class RegistrationFragment : Fragment(R.layout.fragment_registration) {

    private val registrationViewModel by viewModels<RegistrationViewModel>()

    private var _binding: FragmentRegistrationBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentRegistrationBinding.bind(view)
        binding.apply {
            // Do stuff with the views
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}