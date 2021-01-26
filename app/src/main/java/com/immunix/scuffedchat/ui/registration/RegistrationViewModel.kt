package com.immunix.scuffedchat.ui.registration

import androidx.lifecycle.ViewModel
import com.google.firebase.auth.FirebaseAuth

class RegistrationViewModel : ViewModel() {

    private lateinit var mAuth: FirebaseAuth

    // why like this tho
    // why cant i just use the variable directly
    fun shit(kek: FirebaseAuth) {
        mAuth = FirebaseAuth.getInstance()
    }
}