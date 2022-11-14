package com.karthik.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting("Android")
        }
    } }

@Composable
fun Greeting(name: String) {
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(24.dp)//margin
        .background(Color.Blue)
        .padding(24.dp)//padding
        ) {
        Column(modifier = Modifier.weight(1f)){//given weight to this column
            Text(text = "Hello, ", color= R.color.black)
            Text(text = name, color= Color.White)  
        }
        OutlinedButton(onClick = { /*TODO*/ }) {
            Text("Show more")
        }
    }
}

