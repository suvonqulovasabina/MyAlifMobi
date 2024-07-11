@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myalifmobi.utils.search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.search

@Composable
fun SearchMyAlif() {
    var password by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)


    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
                .background(color = search)
        ) {
            Spacer(modifier = Modifier.size(8.dp))
            Image(
                modifier = Modifier
                    .size(18.dp)
                    .align(Alignment.CenterVertically)
                    .background(color = search), painter =
                painterResource(id = R.drawable.serach),
                contentDescription = null
            )
            TextField(
                modifier = Modifier.fillMaxSize(),
                value = password,
                onValueChange = {
                    password = it
                },
                label = {
                    val text1 = stringResource(id = R.string.Service_name)
                    Text(modifier = Modifier, fontSize = 14.sp, text = text1)
                },
                colors = TextFieldDefaults.outlinedTextFieldColors(
                    containerColor = Color.White,
                    focusedBorderColor = Color.White,// does not work
                    unfocusedBorderColor = Color.White,
                )
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyAlifMobiTheme {
        SearchMyAlif()
    }
}
