package com.odin.composefragment.screen.fragment.main

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.odin.composefragment.R

@Preview
@Composable
fun SignUpTopBar(
    @PreviewParameter(SignUpTopBarProvider::class, 1)
    loadNextScreen: () -> Unit
) {
    TopAppBar(
        title = { Text("") },
        backgroundColor = colorResource(id = R.color.white),
        elevation = 0.dp,
        navigationIcon = {
            IconButton(onClick = {
                loadNextScreen()
            }) {
                Icon(Icons.Filled.ArrowBack, contentDescription = "back")
            }
        }
    )
}


class SignUpTopBarProvider : PreviewParameterProvider<Boolean> {
    override val values: Sequence<Boolean>
        get() = sequenceOf(true)
}