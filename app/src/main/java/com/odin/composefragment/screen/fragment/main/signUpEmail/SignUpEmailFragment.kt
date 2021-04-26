package com.odin.composefragment.screen.fragment.main.signUpEmail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.Fragment
import com.odin.composefragment.ui.theme.ComposeFragmentTheme

class SignUpEmailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setContent {
                ComposeFragmentTheme {
                    EmailBoarding()
                }
            }
        }
    }

    @Preview
    @Composable
    fun EmailPreView() {
        ComposeFragmentTheme {
            EmailBoarding()
        }
    }

}