package com.odin.composefragment.screen.fragment.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.tooling.preview.PreviewParameterProvider
import androidx.compose.ui.unit.dp
import com.odin.composefragment.R

@Preview
@Composable
fun SignUpBottomBar(
    @PreviewParameter(SignUpBottomBarProvider::class, 1)
    loadNextScreen: () -> Unit
) {
    val mainButtonColor = ButtonDefaults.buttonColors(
        backgroundColor = colorResource(id = R.color.purple_1),
        contentColor = MaterialTheme.colors.surface
    )
    Row {
        Button(
            colors = mainButtonColor,
            onClick = {
                loadNextScreen()
            },
            modifier = Modifier
                .height(56.dp)
                .fillMaxWidth()
        ) {
            Text(text = "다음", color = colorResource(id = R.color.gray090))
        }
    }
}

class SignUpBottomBarProvider : PreviewParameterProvider<Boolean> {
    override val values: Sequence<Boolean>
        get() = sequenceOf(true)
}