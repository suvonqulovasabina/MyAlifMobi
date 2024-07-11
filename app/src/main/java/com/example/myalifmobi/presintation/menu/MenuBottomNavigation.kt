package com.example.myalifmobi.presintation.menu

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.tab.CurrentTab
import cafe.adriel.voyager.navigator.tab.LocalTabNavigator
import cafe.adriel.voyager.navigator.tab.Tab
import cafe.adriel.voyager.navigator.tab.TabNavigator
import cafe.adriel.voyager.navigator.tab.TabOptions
import com.example.myalifmobi.R
import com.example.myalifmobi.presintation.history.History
import com.example.myalifmobi.presintation.main.MainScreen
import com.example.myalifmobi.presintation.nasiya.Nasiya
import com.example.myalifmobi.presintation.pay.Pay
import com.example.myalifmobi.presintation.transfers.Transfers
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme


class MenuBottomNavigation : Screen {
    @Composable
    override fun Content() {
        Menu()
    }

    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun Menu() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Red)
        ) {
            TabNavigator(Menu) {
                androidx.compose.material.Scaffold(
                    content = {
                        CurrentTab()
                    },
                    bottomBar = {

                        BottomNavigation {
                            TabNavigationItem(Menu)
                            TabNavigationItem(Pay)
                            TabNavigationItem(Transfers)
                            TabNavigationItem(Nasiya)
                            TabNavigationItem(History)
                        }
                    }
                )

            }

        }


    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            Menu()
        }
    }
}

object Menu : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.main)
            val icon = painterResource(R.drawable.ic_home)

            return remember {
                TabOptions(
                    index = 1u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        MainScreen().Content()
    }
}


object Pay : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.pay)
            val icon = painterResource(R.drawable.pay_icon)

            return remember {
                TabOptions(
                    index = 2u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Pay().Content()
    }
}

object Transfers : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.transfers)
            val icon = painterResource(R.drawable.transers)

            return remember {
                TabOptions(
                    index = 3u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Transfers().Content()
    }
}

object Nasiya : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.nasiya)
            val icon = painterResource(R.drawable.nasiya_alif)

            return remember {
                TabOptions(
                    index = 4u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        Nasiya().Content()
    }
}

object History : Tab {
    override val options: TabOptions
        @Composable
        get() {
            val title = stringResource(R.string.history)
            val icon = painterResource(R.drawable.history)

            return remember {
                TabOptions(
                    index = 5u,
                    title = title,
                    icon = icon
                )
            }
        }

    @Composable
    override fun Content() {
        History().Content()
    }
}

@Composable
fun RowScope.TabNavigationItem(tab: Tab) {
    val tabNavigator = LocalTabNavigator.current

    BottomNavigationItem(
        selected = tabNavigator.current == tab,
        onClick = { tabNavigator.current = tab },
        icon = {
            Icon(
                contentDescription = tab.options.title,
                painter = tab.options.icon!!
            )
        }
    )
}
