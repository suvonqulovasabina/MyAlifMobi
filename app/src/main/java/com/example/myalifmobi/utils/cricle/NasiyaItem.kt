package com.example.myalifmobi.utils.cricle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
@Composable
fun NasiyaItem(){
    Card(modifier = Modifier
        .fillMaxSize()) {
        Image(modifier = Modifier.fillMaxWidth()
            .fillMaxHeight().size(1.dp).background(Color.White),
            painter = painterResource(id = R.drawable.televizor),
            contentDescription = null)
    }
}
@Preview(showBackground = true)
@Composable
fun NasiyaPreview(){
    MyAlifMobiTheme {
        NasiyaItem()
    }
}