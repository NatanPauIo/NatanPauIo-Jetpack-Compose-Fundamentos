package com.natan.jetpackcomposeteste

import android.R.attr.onClick
import android.R.attr.title
import android.R.id.title
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.natan.jetpackcomposeteste.componentepronto.NovoInput
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
        var email by remember { mutableStateOf("") }
        var senha by remember { mutableStateOf("") }
        var contexto = LocalContext.current

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
                BottomAppBar(containerColor = Color.Cyan) { }
            }

        ) {paddingValues ->

            Column(Modifier.fillMaxSize().background(color = Color.White).padding(paddingValues),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Página de Login", Modifier.padding(20.dp),fontWeight = FontWeight.Bold, fontSize = 25.sp,
                    )

                NovoInput(value = email,
                    onvalue = {
                    email = it
                }, label = "Email",
                    modifer = Modifier.padding(30.dp).fillMaxWidth(),
                    teclado = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
                )


                NovoInput(value = senha,
                    onvalue = {
                        senha = it
                    }, label = "Senha",
                    modifer = Modifier.padding(30.dp, 0.dp).fillMaxWidth(),
                    teclado = KeyboardOptions(
                        keyboardType = KeyboardType.NumberPassword
                    )
                )



                //botão e suas ações
                Button(onClick = {
                    if(email.isEmpty() || senha.isEmpty()){
                        Toast.makeText(contexto,"Preencha todos os campos", Toast.LENGTH_SHORT).show()
                    }else{
                        Toast.makeText(contexto,"Usuario logado com sucesso!", Toast.LENGTH_SHORT).show()
                    }

                },Modifier.padding(10.dp), colors = ButtonDefaults.buttonColors(Color.Cyan),) {
                    Text(text = "Login")
                }

            }
        }
    }
}

