package com.odin.composefragment.screen.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.odin.composefragment.R
import com.odin.composefragment.ui.theme.ComposeFragmentTheme

class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeFragmentTheme {
                    BottomNextButton {
                        findNavController().navigate(R.id.action_splash_to_main)
                    }
                }
            }
        }
    }
}