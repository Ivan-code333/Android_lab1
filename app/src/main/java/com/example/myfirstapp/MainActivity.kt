package com.example.myfirstapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myfirstapp.ui.theme.MyFirstAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        enableEdgeToEdge()
            MainScreen(Modifier
                .fillMaxSize()
                .padding(
                start = 16.dp,
                top = 8.dp,
                end = 16.dp,
                bottom = 8.dp
            ).background(Color.White))
        }
    }
}

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    verticalArrangement: Arrangement.Vertical = Arrangement.spacedBy(12.dp)){
    Column(modifier = modifier,
        verticalArrangement = verticalArrangement){
        Title()
        OrdersAndConversion(Modifier
            .height(100.dp)
            .fillMaxWidth())
        Revenue(Modifier
            .height(100.dp)
            .fillMaxWidth())
    }
}

@Composable
fun Title(){
    Text(
        text = "Dashboard",
        fontSize = 28.sp,
        fontWeight = FontWeight.Bold
        )
}
@Composable
fun OrdersAndConversion(
    modifier: Modifier = Modifier,
    horizontalArrangement: Arrangement.Horizontal = Arrangement.spacedBy(12.dp)){
    Row(
        modifier = modifier,
        horizontalArrangement = horizontalArrangement){
        Orders(Modifier
            .weight(1f)
            .fillMaxHeight())
        Conversion(Modifier.weight(1f).fillMaxHeight())
    }
}

@Composable
fun Orders(modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE0E0E0))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
        ){
            Text(
                text = "124",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
                )
            Text(
                text = "Orders",
                fontSize = 16.sp,
                color = Color.Gray)
        }
    }
}

@Composable
fun Conversion(modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE0E0E0))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
        ){

            Text(
                text = "82%",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
                )
            Text(
                text = "Conversion",
                fontSize = 16.sp,
                color = Color.Gray
                )
        }
    }

}

@Composable
fun Revenue(modifier: Modifier = Modifier){
    Card(
        modifier = modifier,
        colors = CardDefaults.cardColors(containerColor = Color.White),
        border = BorderStroke(1.dp, Color(0xFFE0E0E0))
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(4.dp, Alignment.CenterVertically)
        ){
            Text(
                text = "Revenue",
                fontSize = 16.sp,
                )
            Text(
                text = "124 500 ₽",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
                )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    MainScreen(Modifier
        .fillMaxSize()
        .padding(
        start = 16.dp,
        top = 8.dp,
        end = 16.dp,
        bottom = 8.dp
    ).background(Color.White))
}