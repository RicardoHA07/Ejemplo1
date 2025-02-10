package com.example.ejemplo1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme{
                 GreetingPreview()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
     Content("Hola","Mundo")
    }

    @Composable
    fun Content(mensaje1:String, mensaje2:String) {
        Column {
            Text(mensaje1,
                fontSize = 30.sp)
            Text(mensaje2,
                lineHeight = 30.sp)
            Text("Ricardo",
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                lineHeight = 32.sp)
        }
    }
}
    /*Modificadores
    * De posicionamiento = width, height, top, bottom, start, end
    * De funcionalidad = click, scroll
    * De apariencia = background, padding, border
    *
     */




