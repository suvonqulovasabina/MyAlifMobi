@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.myalifmobi.presintation.pay

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.hilt.getViewModel
import cafe.adriel.voyager.navigator.bottomSheet.LocalBottomSheetNavigator
import com.example.myalifmobi.R
import com.example.myalifmobi.data.sourse.remote.reques.AlifLacation
import com.example.myalifmobi.presintation.bottomSheet.BottomSheet
import com.example.myalifmobi.ui.theme.MyAlifMobiTheme
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.CameraPositionState
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.MapProperties
import com.google.maps.android.compose.MapUiSettings
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerInfoWindow
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberMarkerState
import org.orbitmvi.orbit.compose.collectSideEffect

class Pay : Screen {
    @SuppressLint("LogNotTimber")
    @Composable
    override fun Content() {
        val localBottomSheetNavigator = LocalBottomSheetNavigator.current
        val viewModel: PayContract.ViewModel = getViewModel<PlayViewModel>()
        Pay(viewModel::onEventDispatcher)
        viewModel.collectSideEffect {
            when (it) {
                is PayContract.SideEffect.BottomSheet -> {
                    Log.d("TTT", "sss")
                    localBottomSheetNavigator.show(BottomSheet(it.alifLacation))
                }
            }
        }

    }
}

@SuppressLint("NotConstructor")
@Composable
fun Pay(click: (PayContract.Intent.OpenPinCOde) -> Unit) {
    val lacationList = ArrayList<AlifLacation>()
    lacationList.add(
        AlifLacation(
            R.drawable.alif_yangi,
            "Укчи 3, Тоshkent, Toshkent, Uzbekistan",
            "http://alifshop.uz/",
            "+998555121212"
        )
    )
    lacationList.add(
        AlifLacation(
            R.drawable.alif_tjg,
            "ул. Фотеха, Ниёзи 51, Dushanbe, Tajikistan",
            "https://www.alif.tj/",
            "+992900909080"
        )
    )
    val zoom = remember { mutableFloatStateOf(15f) }
    val markerState = rememberMarkerState(
        position = LatLng(41.585662085407336, 69.17436497641421),
        key = "Ferghana"
    )

    val list = ArrayList<MarkerState>()

    list.add(MarkerState(position = LatLng(41.585662085407336, 69.17436497641421)))
    list.add(MarkerState(position = LatLng(43.313134494248914, 70.01381178489756)))

    //val context = LocalContext.current

    Box(modifier = Modifier.fillMaxSize()) {
        GoogleMap(
            modifier = Modifier.align(Alignment.Center),
            cameraPositionState = CameraPositionState(
                position = CameraPosition.fromLatLngZoom(
                    LatLng(markerState.position.latitude, markerState.position.longitude),
                    zoom.value
                )
            ),
            properties = MapProperties(isMyLocationEnabled = true),
            uiSettings = MapUiSettings(zoomControlsEnabled = true),
        ) {
            // val customIcon = bitmapDe(context, R.drawable.ic_anor)
            //Marker(state = markerState, icon = customIcon)
            list.forEachIndexed { index, markerState ->
                Marker(
                    markerState,
                    onClick = {
                        click.invoke(PayContract.Intent.OpenPinCOde(lacationList[index]))
                        true
                    }
                )
            }

        }

    }
}


@Preview(showBackground = true)
@Composable

fun GreetingPreview() {
    MyAlifMobiTheme {
        Pay()
    }
}