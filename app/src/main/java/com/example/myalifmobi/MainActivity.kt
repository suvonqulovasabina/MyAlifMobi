package com.example.myalifmobi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import cafe.adriel.voyager.navigator.CurrentScreen
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.navigator.bottomSheet.BottomSheetNavigator
import com.example.myalifmobi.presintation.menu.Pay
import com.example.myalifmobi.presintation.splash.SplashScreen
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.utils.NetworkStatusValidator
import com.example.myalifmobi.utils.navigation.NavigationHandler
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@OptIn(ExperimentalMaterialApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var navigationHandler: NavigationHandler

    @Inject
    lateinit var networkStatusValidator: NetworkStatusValidator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        networkStatusValidator.init(
            availableNetworkBlock = {},
            lostConnection = {}
        )

        setContent {
            MyAlifMobiTheme {
                BottomSheetNavigator(
                    sheetShape = RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp),
                    content = {
                        Navigator(screen = SplashScreen()) { navigator ->
                            navigationHandler.navigationStack
                                .onEach {
                                    it.invoke(navigator)
                                }
                                .launchIn(lifecycleScope)
                            CurrentScreen()
                        }
                    }
                )
            }
        }
    }
}

