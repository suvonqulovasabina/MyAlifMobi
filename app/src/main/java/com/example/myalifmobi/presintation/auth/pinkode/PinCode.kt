package com.example.myalifmobi.presintation.auth.pinkode


import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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


class PinCode : Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier.fillMaxSize()) {


        }

    }

    @SuppressLint("NotConstructor")
    @Composable
    fun PinCode() {
        Column(modifier = Modifier.fillMaxSize().background(alifFon)) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Spacer(modifier = Modifier.size(30.dp))
                Image(
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(start = 16.dp)
                )
                Spacer(modifier = Modifier.size(55.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally), text = stringResource(
                        id =
                        R.string.enter_passcode,
                    ), fontSize = 14.sp
                )
                Spacer(modifier = Modifier.size(75.dp))
                Row (modifier = Modifier.align(Alignment.CenterHorizontally)){
                    RowWithCircle(color = kulRang)
                    Spacer(modifier = Modifier.size(20.dp))

                    RowWithCircle(color = kulRang)
                    Spacer(modifier = Modifier.size(20.dp))

                    RowWithCircle(color = kulRang)
                    Spacer(modifier = Modifier.size(20.dp))

                    RowWithCircle(color = kulRang)
                }
                Spacer(modifier = Modifier.size(70.dp))
                Text(modifier = Modifier.align(Alignment.CenterHorizontally),

                    text = stringResource(id = R.string.digit_code_for_logging_in_to_alif_mobi))


                Row (modifier = Modifier.weight(0.2f)){

                }

                Row(modifier = Modifier.weight(0.2f)) {

                }

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)

            ) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.3f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {

                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "1", modifier = Modifier.align(Alignment.Center).clickable {

                            },
                            fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "2", modifier = Modifier.align(Alignment.Center),
                            fontSize = 24.sp,
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "3", modifier = Modifier.align(Alignment.Center),
                            fontSize = 24.sp,
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "4", modifier = Modifier.align(Alignment.Center),
                            fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "5", modifier = Modifier.align(Alignment.Center),
                             fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "6", modifier = Modifier.align(Alignment.Center),
                          fontSize = 24.sp
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "7", modifier = Modifier.align(Alignment.Center),
                          fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "8", modifier = Modifier.align(Alignment.Center),
                           fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "9", modifier = Modifier.align(Alignment.Center),
                             fontSize = 24.sp
                        )
                    }

                }
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = stringResource(id = R.string.forgot_passcode),
                            modifier = Modifier
                                .padding(start = 16.dp, end = 16.dp, top = 13.dp)
                                .align(Alignment.Center), fontSize = 10.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Text(
                            text = "0",
                            modifier = Modifier.align(Alignment.Center),
                            fontSize = 24.sp
                        )
                    }
                    Box(modifier = Modifier.weight(1f)) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_delet),
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(Alignment.Center)
                        )
                    }

                }


                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.2f)

                ) {

                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            PinCode()
        }
    }

    @Composable
    fun Number() {
        Column {

        }
    }

    @SuppressLint("ComposableNaming")
    @Composable

    fun RowWithCircle(color: Color) {
        Button(modifier = Modifier.size(10.dp),

            onClick = {

            }, colors = ButtonDefaults.buttonColors(color)
        ) {

        }
    }

}
