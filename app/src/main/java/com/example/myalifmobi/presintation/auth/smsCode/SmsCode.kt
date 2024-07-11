package com.example.myalifmobi.presintation.auth.smsCode

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.focusable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusRequester
import androidx.compose.ui.focus.focusRequester
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import com.example.myalifmobi.R
import com.example.myalifmobi.presintation.auth.pinkode.PinCode
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.PurpleGrey40
import com.example.myalifmobi.ui.theme.White
import com.example.myalifmobi.ui.theme.alifFon
import com.example.myalifmobi.ui.theme.button

class SmsCode(val phone:String) : Screen {
    @Composable
    override fun Content() {
        val viewModel:SmsCodeContract.ViewModel=getViewModel<SmsCodeViewModel>()
        SmsCode(open = viewModel::onEventDispatcher,phone)
    }
    @SuppressLint("NotConstructor")
    @Composable

    fun SmsCode(open:(SmsCodeContract.Intent)->Unit,phone:String) {
        var expanded1 by remember { mutableStateOf("") }
        var expanded2 by remember { mutableStateOf("") }
        var expanded3 by remember { mutableStateOf("") }
        var expanded4 by remember { mutableStateOf("") }
        var expanded5 by remember { mutableStateOf("") }
        var expanded6 by remember { mutableStateOf("") }


        val focusRequester1 = remember { FocusRequester() }
        val focusRequester2 = remember { FocusRequester() }
        val focusRequester3 = remember { FocusRequester() }
        val focusRequester4 = remember { FocusRequester() }
        val focusRequester5 = remember { FocusRequester() }
        val focusRequester6 = remember { FocusRequester() }
        Column(modifier = Modifier.fillMaxSize()) {
            Spacer(modifier = Modifier.size(20.dp))
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1.2f)
                    .background(color = White)
            ) {
                Image(
                    modifier = Modifier
                        .size(40.dp)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.back),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.size(50.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    text = stringResource(id = R.string.enter_your_phone_number)
                )
                Spacer(modifier = Modifier.size(10.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontSize = 16.sp,
                    text = stringResource(id = R.string.SMS_verification_code_has_been_sent)
                )

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontSize = 16.sp,
                    text = phone
                )
                Spacer(modifier = Modifier.size(5.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    fontSize = 16.sp,
                    text = stringResource(id = R.string.change_number), color = GreenMy
                )
                Spacer(modifier = Modifier.size(20.dp))
                Row(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Column(modifier = Modifier.focusRequester(focusRequester1)
                        .focusable().width(40.dp)) {
                        OutlinedTextField(value = expanded1, onValueChange = {
                            expanded1 = it
                            if (expanded1.length == 1) {
                                focusRequester2.requestFocus()
                            }
                        })
                    }
                    Spacer(modifier = Modifier.size(8.dp))

                    Column(modifier = Modifier.focusRequester(focusRequester2)
                        .focusable().width(40.dp)) {
                        OutlinedTextField(value = expanded2, onValueChange = { new ->
                            expanded2 = new
                            if (expanded2.length == 1) {
                                focusRequester3.requestFocus()
                            }

                        })
                    }
                    Spacer(modifier = Modifier.size(8.dp))

                    Column(modifier = Modifier.focusRequester(focusRequester3)
                        .focusable().width(40.dp)) {
                        OutlinedTextField(value = expanded3, onValueChange = {
                            expanded3 = it
                            focusRequester4.requestFocus()

                            if (expanded3.length == 1) {
                                focusRequester2.requestFocus()
                            }

                        })
                    }
                    Spacer(modifier = Modifier.size(8.dp))

                    Column(modifier = Modifier.focusRequester(focusRequester4)
                        .focusable().width(40.dp)) {
                        OutlinedTextField(value = expanded4, onValueChange = {
                            expanded4 = it
                            if (expanded4.length == 1) {
                                focusRequester5.requestFocus()
                            }
                        })
                    }
                    Spacer(modifier = Modifier.size(8.dp))

                    Column(modifier = Modifier.focusRequester(focusRequester5)
                        .focusable().width(40.dp)) {
                        OutlinedTextField(value = expanded5, onValueChange = {
                            expanded5 = it
                            if (expanded5.length == 1) {
                                focusRequester6.requestFocus()
                            }
                        })
                    }
                    Spacer(modifier = Modifier.size(8.dp))

                    Column(modifier = Modifier.width(40.dp).focusRequester(focusRequester6)
                        .focusable()) {
                        OutlinedTextField(value = expanded6, onValueChange = {
                            expanded6 = it
                            if (expanded6.length == 1) {

                            }
                        })
                    }
                }
                Spacer(modifier = Modifier.size(50.dp))

                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    color = PurpleGrey40,
                    text = stringResource(id = R.string.second)
                )


            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .weight(1.2f),
            ) {

                Column(modifier = Modifier.weight(0.58f)) {

                }
                val isEnabled = remember { mutableStateOf(false) }
                isEnabled.value =
                    expanded1.isNotEmpty() && expanded2.isNotEmpty() && expanded3.isNotEmpty() && expanded4.isNotEmpty() && expanded5.isNotEmpty()
                Box(
                    modifier = Modifier
                        .fillMaxWidth()

                        .height(95.dp)
                        .padding(horizontal = 16.dp, vertical = 16.dp)
                        .clip(RoundedCornerShape(8.dp))
                        .background(if (isEnabled.value) GreenMy else button)
                        .clickable(enabled = isEnabled.value) {
                            // Kliklash funktsiyasi
                            if (isEnabled.value) {
                                open.invoke(SmsCodeContract.Intent.OpenPinCOde)
                            }


                        }
                ) {
                    Text(
                        modifier = Modifier.align(Alignment.Center),
                        text = "Continue",
                        fontWeight = FontWeight.Bold,
                        color = Color.White,
                        style = TextStyle(color = if (isEnabled.value) Color.White else Color.Gray)
                    )
                }


            }
        }
    }
    @Preview(showBackground = true)
    @Composable


    fun GreetingPreview() {
        MyAlifMobiTheme {
            SmsCode({},"")
        }
    }

}