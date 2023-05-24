package com.example.medsync

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class AuthFragment : Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            findNavController().navigate(R.id.action_authFragment_to_mainFragment)
//            val i = Intent(this , MainMain::class.java)
//            startActivity(i)
        })
    }
}