package com.example.myalifmobi.presintation.bottomSheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.example.myalifmobi.data.sourse.remote.reques.AlifLacation


class BottomSheet(val alifLacation: AlifLacation) : Screen {
    @Composable
    override fun Content() {
        Column(modifier = Modifier.height(400.dp).fillMaxWidth()) {
            Image(
                modifier = Modifier.height(200.dp),
                painter = painterResource(id = alifLacation.image),
                contentDescription = null

            )
            Text(text = alifLacation.location)
            Text(text = alifLacation.network)
            Text(text = alifLacation.phone)
        }
    }
}
/*       @SuppressLint("NotConstructor")
       @Composable
       fun BottomSheet(alifLacation: AlifLacation) {
           ModalBottomSheet(
               modifier = Modifier.height(400.dp).fillMaxWidth(),
               onDismissRequest = {}) {
               Column(modifier = Modifier.fillMaxSize()) {
                   Image(

                       modifier = Modifier.weight(0.4f),
                       painter = painterResource(id = alifLacation.image),
                       contentDescription = null

                   )
                   Text(text = alifLacation.location)
                   Text(text = alifLacation.network)
                   Text(text = alifLacation.phone)
               }


           }
       }
   }
}*/