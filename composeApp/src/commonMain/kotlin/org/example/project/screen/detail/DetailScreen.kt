package org.example.project.screen.detail

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator

class DetailScreen :Screen{
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column {
                Text("Detail screen")

                Button(
                    onClick = {
                        navigator?.pop()
                    }
                ){
                    Text("Go back")
                }
            }

        }
    }

}