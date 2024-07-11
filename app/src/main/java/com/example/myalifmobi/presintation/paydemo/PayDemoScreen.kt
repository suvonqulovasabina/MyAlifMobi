package com.example.myalifmobi.presintation.paydemo

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.material3.Card
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
import com.example.myalifmobi.ui.theme.Black
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.White
import com.example.myalifmobi.ui.theme.item
import com.example.myalifmobi.ui.theme.search
import com.example.myalifmobi.ui.theme.text
import com.example.myalifmobi.utils.TransferItem
import com.example.myalifmobi.utils.search.SearchMyAlif

class PayDemoScreen : Screen {
    @Composable
    override fun Content() {

    }

    @SuppressLint("NotConstructor")
    @Composable
    fun PayDemoScreen() {
        val scroll = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scroll)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .height(80.dp)
            ) {

            }
            Column(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                SearchMyAlif()
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = text,
                    text = stringResource(id = R.string.Saved_payments)
                )
                Spacer(modifier = Modifier.size(12.dp))
                Row(modifier = Modifier.fillMaxWidth()) {
                    Row(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)

                            .weight(1.5f)
                            .height(50.dp)
                            .border(1.dp, color = item, shape = RoundedCornerShape(8.dp))

                    ) {
                        Spacer(modifier = Modifier.weight(0.14f))
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                                .align(Alignment.CenterVertically),
                            text = stringResource(id = R.string.Create_template),
                            color = GreenMy
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(2f)
                    ) {
                        Spacer(modifier = Modifier.size(10.dp))
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.CenterHorizontally),
                            text = stringResource(id = R.string.Save_frequent_payments_in_your_favorites),
                            color = text
                        )
                    }
                }
                Spacer(modifier = Modifier.size(40.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = stringResource(id = R.string.my_home),
                    color = text
                )
                Spacer(modifier = Modifier.size(20.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(110.dp)
                        .padding(horizontal = 16.dp)

                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(color = search)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(1f)
                        ) {
                            Spacer(modifier = Modifier.size(20.dp))

                            Image(
                                modifier = Modifier.padding(horizontal = 16.dp),
                                painter = painterResource(id = R.drawable.pay),
                                contentDescription = null
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .weight(3f)
                        ) {
                            Spacer(modifier = Modifier.size(20.dp))
                            androidx.compose.material3.Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp),
                                text = stringResource(id = R.string.add_home),
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.size(0.dp))

                            androidx.compose.material3.Text(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(horizontal = 16.dp),
                                text = stringResource(id = R.string.electricity),
                                fontSize = 12.sp
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.size(20.dp))
                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = text,
                    text = stringResource(id = R.string.Service_name)
                )
                Spacer(modifier = Modifier.size(10.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))

                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(5.dp))
                TransferItem()
                Spacer(modifier = Modifier.size(20.dp))
                CardItem()
                Spacer(modifier = Modifier.height(85.dp))
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            PayDemoScreen()
        }
    }
}

@Composable
fun CardItem() {
    Card(modifier = Modifier.height(135.dp)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = search)
        ) {
            Spacer(modifier = Modifier.size(15.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                fontSize = 16.sp, color = text,
                text = stringResource(id = R.string.could_not_find_what_you_searched_for_Suggest)
            )
            Spacer(modifier = Modifier.size(15.dp))
            Card(modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(45.dp)) {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(color = White)) {
                    Text(modifier = Modifier.align(Alignment.Center), color = Black, fontWeight = FontWeight.Bold, text = stringResource(id = R.string.Suggest_a_payment))
                }
            }
        }
    }
}