package com.example.myalifmobi.utils

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.myalifmobi.data.sourse.remote.reques.AlifLacation

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetDialog(alifLacation: AlifLacation) {
    ModalBottomSheet(modifier = Modifier
        .height(400.dp)
        .fillMaxWidth(), onDismissRequest = {}) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.weight(0.4f),
                painter = painterResource(id = alifLacation.image),
                contentDescription = null
            )
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = alifLacation.location)
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = alifLacation.network)
            Spacer(modifier = Modifier.size(10.dp))

            Text(text = alifLacation.phone)
        }


    }
}