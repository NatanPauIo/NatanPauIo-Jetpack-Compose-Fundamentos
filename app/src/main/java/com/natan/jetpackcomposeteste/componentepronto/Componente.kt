package com.natan.jetpackcomposeteste.componentepronto

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NovoInput(
    value : String, onvalue : (String) -> Unit, label : String, modifer : Modifier = Modifier, teclado : KeyboardOptions = KeyboardOptions()
){

    OutlinedTextField(
        value = value,
        onValueChange = onvalue,
        modifier = modifer,
        label = {Text(text = label)},
        maxLines = 2,
        keyboardOptions = teclado,
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.White,
            unfocusedContainerColor = Color.White,
            focusedTextColor = Color.Blue,
            unfocusedTextColor = Color.Blue,
            focusedLabelColor = Color.Blue,
            focusedIndicatorColor = Color.Blue,
            cursorColor = Color.Blue
        )

    )

}

@Preview
@Composable
fun NovoInputPreview(){
    var nome = ""
    NovoInput(value = nome,
        onvalue = {
        nome = it
    }, label = "Email"
    )
}