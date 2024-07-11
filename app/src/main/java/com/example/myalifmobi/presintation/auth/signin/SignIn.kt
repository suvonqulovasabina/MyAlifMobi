package com.example.myalifmobi.presintation.auth.signin

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.Black
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.White
import com.example.myalifmobi.ui.theme.alif
import com.example.myalifmobi.ui.theme.alifFon
import com.example.myalifmobi.ui.theme.button
import com.example.myalifmobi.ui.theme.kulRang

class SignIn : Screen {

    @Composable
    override fun Content() {
        val viewModel: SignInContract.ViewModel = getViewModel<SingInViewModel>()
        val open = viewModel::onEventDispatcher
        SignIn(open)
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("NotConstructor")
    @Composable
//    open:(SignInContract.Intent)->Unit
    fun SignIn(open: (SignInContract.Intent) -> Unit) {

//        val selectedOption by remember { mutableStateOf("1") }
//        var phone by remember { mutableStateOf("") }
//        var number by remember {
//            mutableStateOf("")
//        }
        var phoneNumber by rememberSaveable { mutableStateOf("") }
        var password by rememberSaveable { mutableStateOf("") }
        val checkedState = remember { mutableStateOf(false) }



        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(alifFon)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2.4f)
                    .background(color = White)
            ) {
                Spacer(modifier = Modifier.size(0.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.11f)
                        .background(color = White)
                ) {
                    Row(
                        modifier = Modifier.align(alignment = Alignment.TopEnd)
                    ) {
                        Text(
                            text = stringResource(id = R.string.help),
                            modifier = Modifier.padding(16.dp),
                            color = GreenMy
                        )
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .weight(0.45f)
                        .background(color = White)
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = stringResource(id = R.string.Sign_In),
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            fontSize = 20.sp,
                            color = Black,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(
                            text = stringResource(id = R.string.enter_your_phone_number),
                            fontSize = 13.sp,
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )

                        Spacer(modifier = Modifier.size(60.dp))

                        Row(
                            modifier = Modifier
                                .padding(horizontal = 16.dp)
                                .fillMaxWidth()
                                .border(1.dp, color = alif),
                            verticalAlignment = Alignment.CenterVertically

                        ) {

                            Box(
                                modifier = Modifier
                                    .height(55.dp)


                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxSize()

                                        .padding(horizontal = 8.dp)
                                        .fillMaxHeight()
                                ) {
                                    Box(modifier = Modifier.fillMaxHeight()) {
                                        Image(
                                            modifier = Modifier
                                                .size(30.dp)
                                                .align(Alignment.CenterStart)
                                                .padding(start = 8.dp),
                                            painter = painterResource(id = R.drawable.bayroq),
                                            contentDescription = null
                                        )


                                    }
                                    Spacer(modifier = Modifier.size(10.dp))
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterVertically),
                                        text = "+998"
                                    )
                                    Spacer(modifier = Modifier.size(10.dp))
                                    Column(
                                        modifier = Modifier
                                            .width(2.dp)
                                            .fillMaxHeight()
                                            .background(
                                                color = kulRang
                                            )
                                    ) {

                                    }



                                    Column(modifier = Modifier.fillMaxWidth()) {
//                                            PhoneField(phoneNumber,
//                                                mask = "00 000 00 00",
//                                                maskNumber = '0',
//                                                onPhoneChanged = { phoneNumber = it })

                                        Column(modifier = Modifier.weight(5f)) {
                                            PhoneFieldSi(phoneNumber,
                                                mask = "00 000 00 00",
                                                maskNumber = '0',
                                                onPhoneChanged = { phoneNumber = it })

                                        }
                                        Column(modifier = Modifier.weight(0.5f)) {

                                        }


                                    }


                                }


                            }
                        }
                        Spacer(modifier = Modifier.size(10.dp))
                        Row(
                            modifier = Modifier
                                .height(55.dp)
                                .padding(horizontal = 16.dp)
                                .fillMaxWidth()
                                .border(1.dp, color = alif),
                            verticalAlignment = Alignment.CenterVertically

                        ) {
                            TextField(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight(),
                                value = password,
                                onValueChange = {
                                                password=it
                                },

                                colors = TextFieldDefaults.outlinedTextFieldColors(
                                    containerColor = Color.White,
                                    focusedBorderColor = Color.White,// does not work
                                    unfocusedBorderColor = Color.White,
                                )

                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))

                        val isEnabled = remember { mutableStateOf(false) }

                        isEnabled.value = phoneNumber.length == 9

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(55.dp)
                                .padding(horizontal = 16.dp)
                                .clip(RoundedCornerShape(8.dp))
                                .background(if (isEnabled.value) GreenMy else button)
                                .clickable(enabled = isEnabled.value) {
                                    // Kliklash funktsiyasi
                                    isEnabled.value = phoneNumber.length > 5
                                    if (isEnabled.value) {
                                        open.invoke(SignInContract.Intent.PinCode)
                                    }
                                }
                        ) {
                            Text(
                                modifier = Modifier.align(Alignment.Center),
                                text = "Continue",
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                style = TextStyle(color = if (isEnabled.value) Color.White else Gray)
                            )
                        }
                        Spacer(modifier = Modifier.size(20.dp))
                        Text(modifier = Modifier
                            .align(Alignment.CenterHorizontally)
                            .clickable {
                                open.invoke(SignInContract.Intent.SignUp)
                            }, text = stringResource(id = R.string.signUp), color = alif)
                        Spacer(modifier = Modifier.size(30.dp))
                        checkedState.value = phoneNumber.length == 9
                        Row {


                            Checkbox(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)
                                    .align(Alignment.CenterVertically),
                                checked = checkedState.value,
                                onCheckedChange = { isChecked ->
                                    checkedState.value = isChecked
                                },
                            )
                            Text(
                                text = stringResource(
                                    id =
                                    R.string.i_have_read_and_accept_the_terms_of_the_public_offer_and_the_privacy_policy
                                ),
                                modifier = Modifier.padding(start = 8.dp, end = 8.dp),
                                fontSize = 12.sp
                            )
                        }

                    }
                }


            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .background(color = White)
            ) {

            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreviewSabina() {
        MyAlifMobiTheme {
            SignIn()
        }
    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PhoneFieldSi(
    phone: String,
    mask: String = "00 000 00 00",
    maskNumber: Char = '0',
    onPhoneChanged: (String) -> Unit,
) {
    TextField(
        value = phone,
        onValueChange = { it ->
            onPhoneChanged(it.take(mask.count { it == maskNumber }))
        },
        label = {
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        visualTransformation = com.example.myalifmobi.utils.PhoneVisualTransformation(
            mask,
            maskNumber
        ),
        colors = TextFieldDefaults.outlinedTextFieldColors(
            containerColor = Color.White,
            focusedBorderColor = Color.White,// does not work
            unfocusedBorderColor = Color.White,
        )

    )

}

@Preview(showBackground = true)
@Composable

fun GreetingPreview() {
    MyAlifMobiTheme {
        SignIn()
    }
}


class PhoneVisualTransformation(private val mask: String, private val maskNumber: Char) :
    VisualTransformation {

    private val maxLength = mask.count { it == maskNumber }

    override fun filter(text: AnnotatedString): TransformedText {
        val trimmed = if (text.length > maxLength) text.take(maxLength) else text

        val annotatedString = buildAnnotatedString {
            if (trimmed.isEmpty()) return@buildAnnotatedString

            var maskIndex = 0
            var textIndex = 0
            while (textIndex < trimmed.length && maskIndex < mask.length) {
                if (mask[maskIndex] != maskNumber) {
                    val nextDigitIndex = mask.indexOf(maskNumber, maskIndex)
                    append(mask.substring(maskIndex, nextDigitIndex))
                    maskIndex = nextDigitIndex
                }
                append(trimmed[textIndex++])
                maskIndex++
            }
        }

        return TransformedText(annotatedString, PhoneOffsetMapper(mask, maskNumber))
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PhoneVisualTransformation) return false
        if (mask != other.mask) return false
        return maskNumber == other.maskNumber
    }

    override fun hashCode(): Int {
        return mask.hashCode()
    }
}

private class PhoneOffsetMapper(val mask: String, val numberChar: Char) : OffsetMapping {

    override fun originalToTransformed(offset: Int): Int {
        var noneDigitCount = 0
        var i = 0
        while (i < offset + noneDigitCount) {
            if (mask[i++] != numberChar) noneDigitCount++
        }
        return offset + noneDigitCount
    }

    override fun transformedToOriginal(offset: Int): Int =
        offset - mask.take(offset).count { it != numberChar }
}
