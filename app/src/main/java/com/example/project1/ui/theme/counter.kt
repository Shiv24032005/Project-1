package com.example.gfgproject1


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Counter(navController: NavController){
    val count= remember { mutableIntStateOf(0) }
    Column {
        Row (modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(vertical = 50.dp, horizontal = 50.dp),

            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically) {
            Button(onClick
            = {count.intValue--}) {
                Text(text = "-", fontSize = 20.sp)

            }
            Text(text = count.intValue.toString(), fontSize = 20.sp )
            Button(onClick = {count.intValue++}) {
                Text(text = "+", fontSize = 20.sp)

            }
            Button(onClick = { navController.navigate("HomeScreen") }) {
                Text(text = "Go back ", fontSize = 20.sp)

            }

        }

    }
}

