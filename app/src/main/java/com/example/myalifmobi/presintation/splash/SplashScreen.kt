package com.example.myalifmobi.presintation.splash

import android.annotation.SuppressLint
import android.window.SplashScreen
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.alif
import kotlinx.coroutines.delay

class SplashScreen:Screen {
    @Composable
    override fun Content() {
        val viewModel: SplashContract.ViewModel = getViewModel<SplashViewModel>()
        val open= viewModel::onEvenDispatcher
        LaunchedEffect(key1 = Unit) {
            delay(1000)
            open.invoke(SplashContract.Intent.SingIn)
        }
        Splash()
    }
    @SuppressLint("NotConstructor", "ResourceAsColor")
    @Composable

    fun Splash() {
        Column(
            Modifier
                .fillMaxSize()
                .background(color = alif)
        ) {
            Box(
                Modifier
                    .fillMaxSize()
                    .align(Alignment.CenterHorizontally)) {
                Image(painter = painterResource(id = R.drawable.alif), contentDescription = null,
                    modifier = Modifier
                        .size(200.dp)
                        .align(Alignment.Center))
            }
        }
    }
}