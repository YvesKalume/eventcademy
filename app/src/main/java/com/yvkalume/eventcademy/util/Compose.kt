package com.yvkalume.eventcademy.util

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.yvkalume.eventcademy.ui.navigation.Destination
import com.yvkalume.eventcademy.ui.theme.EventCademyTheme

@Composable
fun ThemePreview(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    EventCademyTheme {
        Surface(
            modifier = modifier,
            color = MaterialTheme.colorScheme.background,
            content = content
        )
    }
}

fun NavController.navigate(destination: Destination) {
    navigate(destination.route)
}