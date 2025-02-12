package com.example.ejemplo1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                GreetingPreview()
            }
        }
    }


    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        SetContent()
    }
}

    @Composable
    fun SetContent () {

        Column {
            SimpleButton()
            ButtonWithColor()
            ButtonWithIcon()
            ButtonWithTwoTextView()
            ButtonWithRectangleShape()
            ButtonWithRoundCornerShape()
            ButtonWithCutCornerShape()
        }
    }
@Composable
fun SimpleButton() {
    Button(onClick ={

    }

    ){
        Text(text = "Simple Button")
}
    }

@Composable
fun ButtonWithColor() {
    Button(onClick ={

    }, colors = ButtonDefaults.buttonColors(Color.DarkGray)

    ){
        Text(text = "Button with gray background", color = Color.White)
    }
}
@Composable
fun ButtonWithTwoTextView() {
    Button(onClick = {
        //your onclick code here
    }) {
        Text(text = "Click ", color = Color.Magenta)
        Text(text = "Here", color = Color.Green)
    }
}

@Composable
fun ButtonWithIcon() {
    Button(onClick = {}) {
        Image(
            painterResource(id = R.drawable.carrito),
            contentDescription ="Cart button icon",
            modifier = Modifier.size(20.dp))

        Text(text = "Add to cart",Modifier.padding(start = 10.dp))
    }
}


//Forma de Rectangulo:

@Composable
fun ButtonWithRectangleShape() {
    Button(onClick = {}, shape = RectangleShape) {
        Text(text = "Forma de Rectangulo")
    }
}
//Esquina Redondeada:

@Composable
fun ButtonWithRoundCornerShape() {
    Button(onClick = {}, shape = RoundedCornerShape(20.dp)) {
        Text(text = "Esquina redondeada")
    }
}

//Esquina con terminacion recta:

@Composable
fun ButtonWithCutCornerShape() {
    Button(onClick = {}, shape = CutCornerShape(10)) {
        Text(text = "Esquina en corte")
    }
}

/*Modificadores
* De posicionamiento = width, height, top, bottom, start, end
* De funcionalidad = click, scroll
* De apariencia = background, padding, border
*
 */




