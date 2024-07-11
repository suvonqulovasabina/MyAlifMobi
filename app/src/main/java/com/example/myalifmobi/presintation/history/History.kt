package com.example.myalifmobi.presintation.history

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme

class History:Screen {
    @Composable
    override fun Content() {
        History()
    }
    @SuppressLint("NotConstructor")
    @Composable
    fun History(){
        Column(modifier = Modifier.fillMaxSize()) {

        }
    }
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            History()
        }
    }
}