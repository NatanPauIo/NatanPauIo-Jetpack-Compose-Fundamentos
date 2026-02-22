package com.natan.jetpackcomposeteste

import android.R.attr.title
import android.R.id.title
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.natan.jetpackcomposeteste.ui.theme.JetPackComposeTesteTheme
import org.w3c.dom.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        //setContent onde vai ver a visualização da activity
        setContent {
            NovaTela()
        }
    }

    @OptIn(ExperimentalMaterial3Api::class)
    @Preview
    @Composable
    fun NovaTela(){

        Scaffold(
            topBar = {
            TopAppBar(
                title = {
                    Text(text = "Testando...")
                },
                colors = TopAppBarDefaults.topAppBarColors( containerColor = Color.Cyan),
                actions = {
                    Icon(
                        imageVector = Icons.Rounded.Add,
                        contentDescription = null
                    )
                }
            )
            }
          , bottomBar = {
                BottomAppBar(containerColor = Color.Green) { }
            }

        ) {paddingValues ->

            Column(Modifier.fillMaxSize().background(color = Color.White).padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {



                Surface(Modifier.size(100.dp),
                    color = Color.Gray
                ) { }


                Row() {
                    Surface(Modifier.size(100.dp),
                        color = Color.Red
                    ) { }

                    Surface(Modifier.size(100.dp),
                        color = Color.Yellow
                    ) {

                    }

                    Surface(Modifier.size(100.dp),
                        color = Color.Black
                    ) {

                    }


                }



                Surface(Modifier.size(100.dp),
                    color = Color.Magenta
                ) { }



            }
        }


    }
}

