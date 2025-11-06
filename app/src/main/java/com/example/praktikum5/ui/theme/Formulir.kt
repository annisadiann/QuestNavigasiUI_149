package com.example.praktikum5.ui.theme

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FormIsian(
    jenisK:List<String> = ListOf("Laki-Laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier= Modifier,
        topBar={
            TopAppBar(
                title = {Text(text=stringResource(id=R.string.home),
                    color = Color.White)},
                colors = Top
            )
        })
}