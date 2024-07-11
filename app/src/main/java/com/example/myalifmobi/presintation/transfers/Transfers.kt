package com.example.myalifmobi.presintation.transfers

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.alifFon
import com.example.myalifmobi.ui.theme.kulRang
import com.example.myalifmobi.utils.TransferItem

class Transfers : Screen {
    @Composable
    override fun Content() {

    }

    @SuppressLint("NotConstructor")
    @Composable
    fun Transfers() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(alifFon)
        ) {
            Spacer(modifier = Modifier.size(40.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(id = R.string.money_transfers),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(40.dp))
            TransferItem()
            Spacer(modifier = Modifier.size(0.dp))
            TransferItem()
            Spacer(modifier = Modifier.size(0.dp))
            TransferItem()

            Spacer(modifier = Modifier.size(0.dp))
            TransferItem()

            Spacer(modifier = Modifier.size(0.dp))
            TransferItem()
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            Transfers()
        }
    }
}