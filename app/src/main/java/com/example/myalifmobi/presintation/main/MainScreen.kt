package com.example.myalifmobi.presintation.main

import android.annotation.SuppressLint
import android.graphics.Paint
import android.graphics.Rect
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.nativeCanvas
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.R
import com.example.myalifmobi.data.ui.MyProduct
import com.example.myalifmobi.ui.theme.GreenMy
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.example.myalifmobi.ui.theme.alifFon

class MainScreen : Screen {
    @Composable
    override fun Content() {
        MainScreen()
    }

    @SuppressLint("NotConstructor")
    @Composable
    fun MainScreen() {
        val scrollState = rememberScrollState()

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = alifFon)
                .verticalScroll(scrollState)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.bacrount),
                    contentDescription = null
                )
                Column(
                    modifier = Modifier.fillMaxWidth()

                ) {


                    Spacer(modifier = Modifier.size(40.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        CircleWithText()
                        Spacer(modifier = Modifier.size(10.dp))

                        Text(
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .padding(bottom = 0.dp), text = stringResource(id = R.string.mehmon)
                        )
                        Spacer(modifier = Modifier.weight(0.3f))
                        Image(
                            modifier = Modifier
                                .size(40.dp)
                                .align(Alignment.CenterVertically)
                                .padding(end = 16.dp),
                            painter = painterResource(id = R.drawable.ball),
                            contentDescription = null
                        )
                    }
                    Spacer(modifier = Modifier.size(30.dp))
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(220.dp)
                            .padding(horizontal = 16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .background(Color.White)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.79f)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.pay),
                                    contentDescription = null,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .size(60.dp)
                                        .align(Alignment.CenterHorizontally)
                                )

                            }
                            Text(
                                modifier = Modifier.align(Alignment.CenterHorizontally),
                                text = stringResource(id = R.string.add_card),
                                fontWeight = FontWeight.Bold
                            )
                            Spacer(modifier = Modifier.size(40.dp))
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(0.02f)
                                    .padding(horizontal = 16.dp)
                                    .background(
                                        alifFon
                                    )
                            ) {

                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .weight(1f)
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Spacer(modifier = Modifier.size(20.dp))
                                    Image(
                                        modifier = Modifier
                                            .size(20.dp)
                                            .align(Alignment.CenterHorizontally),
                                        painter = painterResource(id = R.drawable.qr_code),
                                        contentDescription = null
                                    )
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = stringResource(id = R.string.qr_scanner)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(0.01f)
                                ) {
                                    Spacer(modifier = Modifier.size(20.dp))
                                    Image(
                                        modifier = Modifier
                                            .size(20.dp)
                                            .align(Alignment.CenterHorizontally),
                                        painter = painterResource(id = R.drawable.qr_code),
                                        contentDescription = null
                                    )
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = stringResource(id = R.string.qr_scanner)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Spacer(modifier = Modifier.size(20.dp))
                                    Image(
                                        modifier = Modifier
                                            .background(GreenMy)
                                            .size(20.dp)
                                            .align(Alignment.CenterHorizontally),
                                        painter = painterResource(id = R.drawable.ic_pay),
                                        contentDescription = null
                                    )
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = stringResource(id = R.string.qr_scanner)
                                    )
                                }
                                Column(
                                    modifier = Modifier
                                        .weight(0.01f)
                                        .background(alifFon)
                                ) {

                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Spacer(modifier = Modifier.size(20.dp))
                                    Image(
                                        modifier = Modifier
                                            .size(20.dp)
                                            .align(Alignment.CenterHorizontally),
                                        painter = painterResource(id = R.drawable.qr_code),
                                        contentDescription = null
                                    )
                                    Text(
                                        modifier = Modifier.align(Alignment.CenterHorizontally),
                                        text = stringResource(id = R.string.qr_scanner)
                                    )
                                }
                            }

                        }
                    }

                }
            }
            Spacer(modifier = Modifier.size(30.dp))

            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(horizontal = 16.dp),
                    text = stringResource(id = R.string.cards)
                )




                Text(
                    modifier = Modifier
                        .align(
                            Alignment.TopEnd
                        )
                        .padding(horizontal = 16.dp),
                    text = stringResource(id = R.string.add),
                    color = GreenMy
                )
            }
            Spacer(modifier = Modifier.size(12.dp))
            val list: ArrayList<MyProduct> = ArrayList()
            val list2: ArrayList<MyProduct> = ArrayList()
            list2.add(MyProduct(name = R.string.all_cards, name2 = 2, image = R.drawable.pay))

            list.add(
                MyProduct(
                    name = R.string.nasiya_bor, name2 = R.string.alif_nasiya, image = R.drawable.pay
                )
            )
            list.add(
                MyProduct(
                    name = R.string.o_uzs, name2 = R.string.wallet, image = R.drawable.pay
                )
            )
            list.add(
                MyProduct(
                    name = R.string.o_uzs, name2 = R.string.cashback_card, image = R.drawable.pay
                )
            )
            LazyRow(modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp), content = {
                items(list) {
                    ItemCard(name = it.name, name2 = it.name2, photo = it.image)
                }
                items(list2) {
                    ItemCard2(name = it.name, photo = it.image)
                }

            })

            Spacer(modifier = Modifier.size(30.dp))
            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(id = R.string.services)
            )
//            Spacer(modifier = Modifier.size(30.dp))
            val listItem = ArrayList<Int>()
            listItem.add(R.drawable.alif_shop)
            listItem.add(R.drawable.alif_2)
            listItem.add(R.drawable.alif_3)
            listItem.add(R.drawable.alif_4)
            listItem.add(R.drawable.alif_5)
            listItem.add(R.drawable.alif_6)
            listItem.add(R.drawable.alif_7)
            LazyRow(modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 8.dp), content = {
                items(listItem) {
                    ServiceItem(image = it)
                }
            })
            Spacer(modifier = Modifier.size(25.dp))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp), text = stringResource(id = R.string.my_home)
            )
            Spacer(modifier = Modifier.size(10.dp))
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .padding(horizontal = 16.dp)
                    .fillMaxWidth()
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(Color.White)
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
                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            text = stringResource(id = R.string.add_home),
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.size(0.dp))

                        Text(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp),
                            text = stringResource(id = R.string.electricity),
                            fontSize = 12.sp
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.size(30.dp))
            Column(modifier = Modifier.fillMaxWidth()) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Text(
                        modifier = Modifier.padding(horizontal = 16.dp),
                        text = stringResource(id = R.string.saved_payments)

                    )
                    Text(
                        modifier = Modifier
                            .padding(horizontal = 16.dp)
                            .align(Alignment.TopEnd),
                        text = stringResource(id = R.string.all),
                        color = GreenMy,
                        lineHeight = TextUnit(1f, TextUnitType.Sp)
                    )
                }
                Spacer(modifier = Modifier.size(10.dp))
                Card(
                    modifier = Modifier
                        .width(150.dp)
                        .height(150.dp)
                        .padding(horizontal = 16.dp)

                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .background(Color.White)
                    ) {
                        Image(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            painter = painterResource(id = R.drawable.pay),
                            contentDescription = null
                        )

                        Spacer(modifier = Modifier.size(20.dp))

                        Text(
                            modifier = Modifier.align(Alignment.CenterHorizontally),
                            text = stringResource(id = R.string.create_new),
                            color = GreenMy
                        )

                    }


                }
                Spacer(modifier = Modifier.size(30.dp))
                Box(
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(horizontal = 64.dp)
                        .background(color = Color.White, shape = RoundedCornerShape(64.dp))
// Radiusni 16.dp qilib berish
                ) {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .height(60.dp)

                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .align(Alignment.CenterHorizontally)
                                .background(color = Color.White)
                        ) {
                            Image(
                                modifier = Modifier
                                    .padding(horizontal = 16.dp)
                                    .size(30.dp)
                                    .align(Alignment.CenterVertically),
                                painter = painterResource(id = R.drawable.pay),
                                contentDescription = null
                            )
                            Text(
                                modifier = Modifier.align(Alignment.CenterVertically),
                                text = "sabina",
                                color = GreenMy
                            )
                        }
                    }
                }
                Spacer(modifier = Modifier.size(110.dp))
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyAlifMobiTheme {
            MainScreen()
        }
    }
}
@Composable
fun CircleWithText() {

    Canvas(
        modifier = Modifier
            .width(55.dp)
            .height(55.dp)
            .padding(start = 16.dp)
    ) {
        val radius = size.minDimension / 2f
        val centerX = size.width / 2f
        val centerY = size.height / 2f

        drawContext.canvas.nativeCanvas.apply {
            val shadowRadius = 44.dp.toPx()
            val shadowPaint = Paint().apply {
                color = Color.Gray.toArgb()
                setShadowLayer(shadowRadius, 0f, 0f, color)
                style = Paint.Style.FILL
                isAntiAlias = true
            }

            drawCircle(
                centerX, centerY, radius, shadowPaint
            )

            drawCircle(centerX, centerY, radius, Paint().apply {
                color = Color.Red.toArgb()
                style = Paint.Style.FILL
                isAntiAlias = true
            })

            val textPaint = Paint().apply {
                color = Color.White.toArgb()
                style = Paint.Style.FILL
                isAntiAlias = true
                textAlign = Paint.Align.CENTER
                textSize = 48f
            }

            val text = "M"
            val textBounds = Rect()

            textPaint.getTextBounds(text, 0, text.length, textBounds)
            val textX = centerX - textBounds.exactCenterX() / 2f + 10
            val textY = centerY + textBounds.height() / 2f

            drawText(text, textX, textY, textPaint)
        }
    }
}

@Composable
fun ItemCard(name: Int, name2: Int, photo: Int) {
    Card(
        modifier = Modifier
            .width(180.dp)
            .height(110.dp)
            .padding(horizontal = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Spacer(modifier = Modifier.size(10.dp))
            Text(modifier = Modifier.padding(horizontal = 16.dp), text = stringResource(id = name))
            Spacer(modifier = Modifier.size(5.dp))

            Text(
                modifier = Modifier.padding(horizontal = 16.dp),
                text = stringResource(id = name2),
                fontSize = 12.sp
            )

            Spacer(modifier = Modifier.size(0.dp))
            Image(
                modifier = Modifier
                    .size(80.dp)
                    .padding(horizontal = 16.dp),
                painter = painterResource(id = photo),
                contentDescription = null
            )

        }

    }
}

@Composable
fun ItemCard2(name: Int, photo: Int) {
    Card(
        modifier = Modifier
            .width(110.dp)
            .height(110.dp)
            .padding(horizontal = 4.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Image(
                modifier = Modifier
                    .width(80.dp)
                    .height(60.dp)
                    .padding(horizontal = 16.dp)
                    .align(Alignment.CenterHorizontally),
                painter = painterResource(id = photo),
                contentDescription = null
            )
            Text(
                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .align(Alignment.CenterHorizontally),
                fontSize = 14.sp,
                text = stringResource(id = name),
                color = GreenMy
            )
        }

    }
}

@Composable
fun ServiceItem(image: Int) {

        Image(
            modifier = Modifier.height(120.dp),
            painter = painterResource(id = image),
            contentDescription = null
        )


}