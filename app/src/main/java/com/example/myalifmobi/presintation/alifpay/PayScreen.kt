package com.example.myalifmobi.presintation.alifpay

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.model.rememberScreenModel
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.utils.collopsing.Material3ScaffoldLibrary

class PayScreen : Screen {
    @Composable
    override fun Content() {

    }

    @SuppressLint("NotConstructor", "UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun PayScreen() {
        val remember = rememberScrollState()
        Column(modifier = Modifier.fillMaxSize()) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colors.background,
            ) {
                // ScaffoldLibrary()
                // BoxLibrary()
                Material3ScaffoldLibrary()
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            PayScreen()
        }
    }
}
@Composable
fun NoScroll() {
    Column(modifier = Modifier.height(80.dp)) {
        Column(modifier = Modifier
            .fillMaxSize()
            .weight(2f)) {

        }
        Column(modifier = Modifier
            .fillMaxSize()
            .weight(2f)) {
            Text(modifier = Modifier
                .padding(horizontal = 16.dp)
                .size(24.dp), text = stringResource(id = R.string.pay))
        }
    }
}

@Composable
fun yesScroll() {
    Column(modifier = Modifier.height(80.dp)) {

        Column(modifier = Modifier
            .fillMaxSize()){
            Text(modifier = Modifier
                .background(Color.Red)
                .padding(horizontal = 16.dp)
                .size(24.dp), text = stringResource(id = R.string.pay))
        }
    }
}
@Composable
fun Demo(){
    Column(modifier = Modifier
        .fillMaxSize()
        .height(80.dp)) {
        Text(text = "sabina")
        Text(text = "mahliyo")
        Text(text = "dilshid")
        Text(text = "azam")
        Text(text = "sinor")
    }
}