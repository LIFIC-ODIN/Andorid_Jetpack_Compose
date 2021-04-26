package com.odin.composefragment.screen.fragment.splash

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.odin.composefragment.R
import com.odin.composefragment.ui.theme.ComposeFragmentTheme

class SplashFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeFragmentTheme {
                    SplashView {
                        findNavController().navigate(R.id.action_splash_to_main)
                    }
                }
            }
        }
    }
}