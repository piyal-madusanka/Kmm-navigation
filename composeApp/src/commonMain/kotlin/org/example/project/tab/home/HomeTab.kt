package org.example.project.tab.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabOptions
import cafe.adriel.voyager.transitions.SlideTransition
import org.example.project.screen.home.HomeScreen

object HomeTab : Tab {
    @Composable
    override fun Content() {

        Navigator(HomeScreen()) { navigator: Navigator ->

            SlideTransition(navigator)
        }

//      Box(
//          modifier = Modifier.fillMaxSize(),
//          contentAlignment = Alignment.Center
//      ){
//          Text("Home Tab")
//      }
    }

    override val options: TabOptions
        @Composable
        get() = remember {
            TabOptions(
                index = 0u,
                title = "Home",
                icon = null
            )
        }

}