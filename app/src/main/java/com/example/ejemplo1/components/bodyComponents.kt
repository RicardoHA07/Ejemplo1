package com.example.ejemplo1.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TitleView(name: String){
    Text(text =name, fontSize = 30.sp, color = Color.Black)
}