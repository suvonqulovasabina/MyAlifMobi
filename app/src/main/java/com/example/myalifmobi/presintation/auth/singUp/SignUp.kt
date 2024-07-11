package com.example.myalifmobi.presintation.auth.singUp

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
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
import com.example.myalifmobi.presintation.auth.smsCode.SmsCode
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.button
import com.example.myalifmobi.utils.PhoneField
import com.example.myalifmobi.utils.PhoneVisualTransformation

class SignUp (): Screen {
    @Composable
    override fun Content() {
        val viewModel: SignUpContract.ViewModel = getViewModel<SignUpViewModel>()
        SignUp(viewModel::onEventDispatcher)

    }

    @SuppressLint("NotConstructor")
    @Composable
    fun SignUp(open:(SignUpContract.Intent)->Unit) {
        var firstName by remember { mutableStateOf("") }
        var lastname by remember { mutableStateOf("") }
        var phone by remember { mutableStateOf("") }

        var bornDate by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var gender by remember { mutableStateOf("") }

        Column(
            modifier = Modifier
                .fillMaxSize()

        ) {


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(0.2f)
            ) {

                Spacer(modifier = Modifier.size(60.dp))
                Text(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    text = stringResource(id = R.string.welcome),
                    fontSize = 24.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
            ) {
                Spacer(modifier = Modifier.size(20.dp))

                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    value = firstName, onValueChange = { new ->
                        firstName = new


                    }, label = {
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp),
                            text = stringResource(id = R.string.name)
                        )

                    })
                Spacer(modifier = Modifier.size(20.dp))


                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    value = lastname, onValueChange = {
                        lastname = it

                    },  label = {
                        Text(
                            modifier = Modifier,
                            text = stringResource(id = R.string.last)
                        )
                    })
                Spacer(modifier = Modifier.size(20.dp))
                BornField(bornDate,
                    mask = "00 0000 00",
                    maskNumber = '0',
                    onPhoneChanged = { bornDate = it })
                PhoneFieldUp(phone,
                    mask = "00 000 00 00",
                    maskNumber = '0',
                    onPhoneChanged = { phone = it })
                Spacer(modifier = Modifier.size(20.dp))

                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    value = gender, onValueChange = {

                        gender = it
                    }, label = {
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp),
                            text = stringResource(id = R.string.gender)
                        )
                    })

                Spacer(modifier = Modifier.size(20.dp))

                OutlinedTextField(modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                    value = password, onValueChange = {
                        password = it
                    },  label = {
                        Text(
                            modifier = Modifier.padding(horizontal = 8.dp),
                            text = stringResource(id = R.string.password)
                        )

                    })


                val isEnabled = remember { mutableStateOf(true) }

                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                ) {


                    Column(modifier = Modifier.weight(1f)) {

                    }

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
                                    val s= "+998$phone"
                                    open.invoke(
                                        SignUpContract.Intent.OpenSmsCode(
                                            s,
                                            password,
                                            firstName,
                                            lastname,
                                            bornDate,
                                            gender
                                        )
                                    )
                                }
                            }
                    ) {
                        androidx.compose.material3.Text(
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
        

    }
    @Preview(showBackground = true)
    @Composable

    fun GreetingPreview() {
        MyAlifMobiTheme {
            SignUp(open = {})
        }
    }

    class PhoneVisualTransformation(private val mask: String, private val maskNumber: Char) : VisualTransformation {

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

}
@Composable
fun PhoneFieldUp(
    phone: String,
    mask: String = "00 000 00 00",
    maskNumber: Char = '0',
    onPhoneChanged: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        value = phone,
        onValueChange = { it ->
            onPhoneChanged(it.take(mask.count { it == maskNumber }))
        },
        label = {
                Text(modifier = Modifier.padding(horizontal = 0.dp), text = stringResource(id = R.string.phone))
        },

        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        visualTransformation = PhoneVisualTransformation(mask, maskNumber),

        )
}
@Composable
fun BornField(
    phone: String,
    mask: String = "00 000 00",
    maskNumber: Char = '0',
    onPhoneChanged: (String) -> Unit
) {
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        value = phone,
        onValueChange = { it ->
            onPhoneChanged(it.take(mask.count { it == maskNumber }))
        },
        label = {
            Text(modifier = Modifier.padding(horizontal = 0.dp), text = stringResource(id = R.string.born_data))
        },


        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
        visualTransformation = PhoneVisualTransformation(mask, maskNumber),

        )
}






