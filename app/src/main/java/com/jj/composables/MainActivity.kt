package com.jj.composables

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jj.composables.ui.theme.ComposablesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposablesTheme {
//                myColumn()
                NewColumn()

                // A surface container using the 'background' color from the theme
            }
        }
    }
}

@Composable
fun NewColumn(){
    Column() {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth()
                .height(200.dp)
                .border(border = BorderStroke(2.dp, color = Color.LightGray)),
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(
                text = "ITEM1",
                modifier = Modifier.align(Alignment.CenterHorizontally))
            Text(
                text = "ITEM1",
                modifier = Modifier.align(Alignment.CenterHorizontally))

        }
        Row(
            modifier = Modifier
                .padding(5.dp)
                .width(200.dp)
                .height(200.dp)
                .border(border = BorderStroke(1.dp, color = Color.LightGray)),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "ITEM2",
                modifier = Modifier.align(Alignment.CenterVertically) )
        }
    }
}






//@Composable
//fun myColumn(){
//    Column(
//        modifier = Modifier
//            .background(color = Color.LightGray)
//            .fillMaxSize()
//            .padding(10.dp)
//    ) {
//        Image(
//            painterResource(
//                R.drawable.ic_launcher_background
//            ),
//            contentDescription = "",
//            modifier = Modifier.height(500.dp),
//            contentScale = ContentScale.Crop,
//        )
//        Column(
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(
//                text = "Happy Meal" ,
//                style = TextStyle(
//                    fontSize = 17.sp,
//                    fontWeight = FontWeight.Bold
//
//                )
//            )
//            Spacer(modifier = Modifier.padding(top = 10.dp))
//            Text(
//                text = "800 Colories" ,
//                style = TextStyle(
//                    fontSize = 17.sp
//                )
//            )
//
//            Spacer(modifier = Modifier.padding(top = 10.dp))
//            Text(
//                text = "£5.99",
//                style = TextStyle(
//                    color = Color.Blue,
//                    fontSize = 17.sp
//                )
//            )
//        }
//    }
//}





