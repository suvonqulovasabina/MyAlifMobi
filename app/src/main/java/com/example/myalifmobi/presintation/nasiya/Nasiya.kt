package com.example.myalifmobi.presintation.nasiya

import android.annotation.SuppressLint
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.R
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.alifFon
import com.example.myalifmobi.ui.theme.card
import com.example.myalifmobi.ui.theme.text
import com.example.myalifmobi.utils.TransferItem
import com.example.myalifmobi.utils.cricle.Circle
import com.example.myalifmobi.utils.cricle.NasiyaItem

class Nasiya : Screen {
    @Composable
    override fun Content() {
        Nasiya()
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun Nasiya() {
        val scroll = rememberScrollState()
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = alifFon)
                .verticalScroll(scroll)
        ) {
            Column(
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()
                    .background(color = GreenMy)
            ) {
                Spacer(modifier = Modifier.size(20.dp))
                Row(
                    modifier = Modifier
                        .height(40.dp)
                        .align(Alignment.CenterHorizontally)
                ) {
                    Image(
                        modifier = Modifier.size(50.dp),
                        painter = painterResource(id = R.drawable.ic_alif),
                        contentDescription = null
                    )
                    Text(
                        modifier = Modifier.align(Alignment.CenterVertically),
                        color = Color.White,
                        text = stringResource(id = R.string.alif_nasiya)
                    )

                }
                Spacer(modifier = Modifier.size(0.dp))
                Box(
                    modifier = Modifier
                        .height(60.dp)
                        .fillMaxWidth()
                        .align(Alignment.CenterHorizontally)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.Center),
                        color = Color.White,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Bold,
                        text = stringResource(id = R.string.buy_in_installments_throughout_uzbekiston)
                    )

                }
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .size(1000.dp)
                        .clip(shape = RoundedCornerShape(100.dp)),
                    painter = painterResource(id = R.drawable.my_alif),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.size(20.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(420.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.White)
                ) {
                    Spacer(modifier = Modifier.size(5.dp))
                    TransferItem()
                    Spacer(modifier = Modifier.size(5.dp))
                    TransferItem()
                    Spacer(modifier = Modifier.size(5.dp))
                    TransferItem()
                    Spacer(modifier = Modifier.size(5.dp))
                    TransferItem()
                    Spacer(modifier = Modifier.size(10.dp))
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(55.dp)
                            .padding(horizontal = 16.dp)
                            .clip(RoundedCornerShape(16.dp))
                            .background(
                                GreenMy
                            )
                    ) {
                        Text(
                            modifier = Modifier.align(Alignment.Center),
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                            text = stringResource(id = R.string.lets_do_it)
                        )
                    }
                    Spacer(modifier = Modifier.size(10.dp))
                    val checkedState = remember { mutableStateOf(false) }

                    Row {


                        Checkbox(
                            modifier = Modifier
                                .padding(horizontal = 8.dp)
                                .padding(vertical = 0.dp),
                            checked = checkedState.value,
                            onCheckedChange = { isChecked ->
                                checkedState.value = isChecked
                            },
                        )
                        Text(
                            text = stringResource(
                                id =
                                R.string.i_have_read_and_accept_the_terms_of_the_public_offer_and_the_privacy_policy
                            ), lineHeight = TextUnit(15f, TextUnitType.Sp),
                            modifier = Modifier.padding(vertical = 8.dp),
                            fontSize = 12.sp
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.size(40.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(id = R.string.store),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.size(0.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(id = R.string.what_you_can_buy_from_us_in_installments),
                color = text,
            )
            Spacer(modifier = Modifier.size(20.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(100.dp)
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }
                Spacer(modifier = Modifier.size(10.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)

                        .weight(1f)
                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }

            }
            Spacer(modifier = Modifier.size(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(100.dp)
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }
                Spacer(modifier = Modifier.size(10.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }

            }
            Spacer(modifier = Modifier.size(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(100.dp)
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }
                Spacer(modifier = Modifier.size(10.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }

            }
            Spacer(modifier = Modifier.size(10.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(100.dp)
            ) {

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)
                        .weight(1f)

                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }
                Spacer(modifier = Modifier.size(10.dp))

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.White)

                        .weight(1f)
                        .padding(horizontal = 0.dp)
                ) {

                    NasiyaItem()
                }

            }
            Spacer(modifier = Modifier.size(10.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(45.dp)
                    .padding(horizontal = 16.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(
                        Color.White
                    )
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    color = GreenMy,
                    fontWeight = FontWeight.Bold,
                    text = stringResource(id = R.string.all_stores)
                )
            }
            Spacer(modifier = Modifier.size(10.dp))



            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .height(480.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.White)
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.size(15.dp))
                        Text(modifier = Modifier.padding(horizontal = 16.dp), text = "FAQ", fontWeight = FontWeight.Bold)
                        Animater(
                            texta = stringResource(id = R.string.what_is_the_limit),
                            text1 = stringResource(
                                id = R.string.the_limit_your_installment_purchase_balance_with_which_you_can_make_purchases_on_the_alifshop_uz_website_or_from_our_partner_stores_withour_watiting_and_additional_verificatoon
                            )
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .padding(horizontal = 16.dp)
                                .background(card)
                        )
                        Spacer(modifier = Modifier.size(0.dp))

                        Animater(
                            texta = stringResource(id = R.string.what_is_the_limit),
                            text1 = stringResource(
                                id = R.string.the_limit_your_installment_purchase_balance_with_which_you_can_make_purchases_on_the_alifshop_uz_website_or_from_our_partner_stores_withour_watiting_and_additional_verificatoon
                            )
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(2.dp)
                                .padding(horizontal = 16.dp)
                                .background(card)
                        )
                        Spacer(modifier = Modifier.size(0.dp))
                        Animater(
                            texta = stringResource(id = R.string.what_is_the_limit),
                            text1 = stringResource(
                                id = R.string.the_limit_your_installment_purchase_balance_with_which_you_can_make_purchases_on_the_alifshop_uz_website_or_from_our_partner_stores_withour_watiting_and_additional_verificatoon
                            )
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                                .height(2.dp)
                                .background(
                                    card
                                )
                        )

                        Spacer(modifier = Modifier.size(0.dp))

                        Animater(
                            texta = stringResource(id = R.string.what_is_the_limit),
                            text1 = stringResource(
                                id = R.string.the_limit_your_installment_purchase_balance_with_which_you_can_make_purchases_on_the_alifshop_uz_website_or_from_our_partner_stores_withour_watiting_and_additional_verificatoon
                            )
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                                .height(2.dp)
                                .background(card)
                        )

                        Spacer(modifier = Modifier.height(30.dp))

                        Box(
                            modifier = Modifier.fillMaxWidth(),

                        ) {

                            Text(
                                modifier = Modifier
                                    .padding(horizontal = 8.dp)

                                    .align(Alignment.Center),
                                fontSize = 15.sp,
                                text = stringResource(id = R.string.if_you_have_difficuties_with_using_the_application_please_concat_us),
                                lineHeight = TextUnit(18f, TextUnitType.Sp),
                                textAlign = TextAlign.Center
                            )

                        }
                        Spacer(modifier = Modifier.height(15.dp))

                        Row(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Circle(color = GreenMy, image = R.drawable.phone)
                            Spacer(modifier = Modifier.size(50.dp))

                            Circle(color = GreenMy, image = R.drawable.sms)

                            Spacer(modifier = Modifier.size(50.dp))
                            Circle(color = GreenMy, image = R.drawable.telegram)


                        }
                        Spacer(modifier = Modifier.height(15.dp))
                        Row(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Spacer(modifier = Modifier.size(40.dp))
                            Text(text = stringResource(id = R.string.call))
                            Spacer(modifier = Modifier.size(40.dp))
                            Text(text = stringResource(id = R.string.online_chat))



                            Spacer(modifier = Modifier.size(30.dp))
                            Text(text = stringResource(id = R.string.telegram))


                        }
                    }


                }
            }
            Spacer(modifier = Modifier.height(80.dp))


        }
    }

    @Preview(showBackground = true)
    @Composable
    fun NasiyaPreview() {
        MyAlifMobiTheme {
            Nasiya()
        }
    }
}

@ExperimentalAnimationApi
@Composable
fun ExpandableD(text: String) {

    var isExpanded by rememberSaveable { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                isExpanded = !isExpanded
            }
    ) {
        Column {

            Text(
                text = text,
                modifier = Modifier.padding(4.dp)

            )

            AnimatedVisibility(visible = isExpanded) {
                Row(modifier = Modifier.clickable {
                    isExpanded = !isExpanded
                }) {
                    Button(onClick = {
                    }) {

                    }
                }
            }

        }

    }

}


@OptIn(ExperimentalAnimationApi::class)
@Composable
@Preview
fun PfofPrevs() {
    MyAlifMobiTheme {
        ExpandableD("Keshbek")
    }
}


@Preview(showBackground = true)
@Composable
fun NasiyaAnimater() {

    MyAlifMobiTheme {
        Animater(
            "hshsah",
            "s    kkknkl jkkjkj bhldjhh hjvvvfuwe gvwviyvfyv ghdevwvgv hdgdwgvdded yuyfeuyfgyu hgewfegfwe"
        )
    }
}

@Composable
fun Animater(texta: String, text1: String) {
    var isExpanded by rememberSaveable {
        mutableStateOf(false)
    }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp)
            .clickable {
                isExpanded = !isExpanded
            }

    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
        ) {
            Text(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .weight(1f), color = text, fontSize = 14.sp, text = texta
            )
            if (isExpanded) {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.1f)
                        .size(15.dp)
                        .clickable {
                            isExpanded = !isExpanded
                        },
                    painter = painterResource(id = R.drawable.top_icon),
                    contentDescription = null
                )

            } else {
                Image(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .weight(0.1f)
                        .padding(vertical = 8.dp)
                        .size(25.dp)

                        .clickable {
                            isExpanded = !isExpanded
                        },
                    painter = painterResource(id = R.drawable.bottom_icon),
                    contentDescription = null
                )

            }

            Spacer(modifier = Modifier.height(60.dp))
        }
        AnimatedVisibility(visible = isExpanded) {
            Text(
                modifier = Modifier,
                lineHeight = TextUnit(15f, TextUnitType.Sp),
                color = text,
                fontSize = 12.sp,
                text = text1
            )

        }
    }
}