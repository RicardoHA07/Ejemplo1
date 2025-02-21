package com.example.ejemplo1

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme
import androidx.compose.ui.tooling.preview.Preview


class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme{
                    Content()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun Content() {
        var costo by remember { mutableStateOf(TextFieldValue("")) }
        var descuento by remember { mutableStateOf(TextFieldValue("")) }

        val precioFinal = calcularPrecioFinal(costo.text, descuento.text)

        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.money),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                TextField(
                    value = costo,
                    label = { Text(text = "Costo del producto") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    onValueChange = { costo = it }
                )
                Spacer(modifier = Modifier.height(8.dp))
                TextField(
                    value = descuento,
                    label = { Text(text = "Descuento (%)") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    onValueChange = { descuento = it }
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Precio final: $precioFinal",
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold

                )
            }
        }
    }

    fun calcularPrecioFinal(costo: String, descuento: String): String {
        val costoDouble = costo.toDoubleOrNull() ?: return ""
        val descuentoDouble = descuento.toDoubleOrNull() ?: return ""
        val precioFinal = costoDouble - (costoDouble * (descuentoDouble / 100))
        return "$${"%.2f".format(precioFinal)}"
    }
}