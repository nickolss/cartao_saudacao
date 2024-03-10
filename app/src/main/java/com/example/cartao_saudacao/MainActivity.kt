package com.example.cartao_saudacao

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.example.cartao_saudacao.ui.theme.CartaosaudacaoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartaosaudacaoTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Cartao(
                        full_name = "Nickolas Maia de Araujo",
                        image = R.drawable.linux
                    )
                }
            }
        }
    }
}

@Composable
fun Cartao(full_name: String, image: Int ,modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            val image = painterResource(image)
            Image(painter = image, contentDescription = "Linux Icon")
        }
        
        Row(
            modifier
                .padding(Dp(10f))
        ){
            Text(
                text = full_name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Row{
            Text(
                text = "3° Novotec Desenvolvimento de Sistemas AMS"
            )
        }
        
    }
}