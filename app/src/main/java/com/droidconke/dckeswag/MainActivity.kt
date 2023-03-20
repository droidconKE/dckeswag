package com.droidconke.dckeswag

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.droidconke.dckeswag.ui.theme.DckeswagTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DckeswagTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("swag")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Buy $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DckeswagTheme {
        Greeting("Android")
    }
}