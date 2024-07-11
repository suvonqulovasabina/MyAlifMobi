package com.example.myalifmobi.utils.cricle

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme

@Composable
fun Circle(color: Color,image:Int){
    Box(
        modifier = Modifier
            .size(50.dp)
            .shadow(1.dp, RoundedCornerShape(100.dp))
            .background(color)
    ) {
        Icon(
            modifier = Modifier
                .size(25.dp)
                .align(Alignment.Center)
                ,
            tint = Color.White,
            painter = painterResource(id = image),
            contentDescription = null
        )
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewCircle(){
    MyAlifMobiTheme {
        Circle(Color.Blue,R.drawable.alif_2)
    }
}