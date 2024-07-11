package com.example.myalifmobi.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.kulRang

@Composable
fun TransferItem() {
    Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp)) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            painter = painterResource(id = R.drawable.pay),
            contentDescription = null
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(3f)
        ) {
            Spacer(modifier = Modifier.size(12.dp))
            Text(
                modifier = Modifier,
                text = stringResource(id = R.string.enter_your_phone_number),
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.size(5.dp))
            Text(
                modifier = Modifier,
                text = stringResource(id = R.string.enter_your_phone_number),
                fontSize = 14.sp,
                color = kulRang
            )

        }
    }
}