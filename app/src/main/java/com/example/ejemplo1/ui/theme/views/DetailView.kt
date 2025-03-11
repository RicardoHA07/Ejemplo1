package com.example.ejemplo1.ui.theme.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.ejemplo1.components.ActionButton
import com.example.ejemplo1.components.MainIconButton
import com.example.ejemplo1.components.TitleBar
import java.lang.reflect.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailView(navController: NavController, id: Int) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleBar("Detail View") },
                colors = androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(Icons.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        },
        floatingActionButton = {
            ActionButton(Color.Blue)
        }
    ) {
        ContentView(navController, id)
    }
}

@Composable
private fun ContentView(navController: NavController, id: Int) {
    LazyColumn {
        item {
            Text(
                text = "ID recibido: $id",
                modifier = Modifier.padding(16.dp), // ✅ CORRECTO
                style = MaterialTheme.typography.bodyLarge
            )

        }
    }
}
