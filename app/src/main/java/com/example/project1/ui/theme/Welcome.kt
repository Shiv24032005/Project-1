package com.example.gfgproject1

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun Welcome(navController: NavController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        .padding(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Text(text = "AAPKA KA SAWAGAAT HAI", fontSize = 40.sp)
        Button(onClick = {navController.navigate("CounterApp")}) {
            Text(text = "Counter App")

        }
        Button(onClick = {
            navController.navigate("Items")
        }) {
            Text(text = "Items")

        }


    }

}