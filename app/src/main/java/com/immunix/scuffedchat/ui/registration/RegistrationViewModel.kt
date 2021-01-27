package com.immunix.scuffedchat.ui.registration

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class RegistrationViewModel : ViewModel() {

    private lateinit var mAuth: FirebaseAuth

    // TODO registration
    fun foo(kek: FirebaseAuth) {
        mAuth = FirebaseAuth.getInstance()
    }
}