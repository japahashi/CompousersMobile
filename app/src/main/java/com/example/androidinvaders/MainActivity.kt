package com.example.androidinvaders

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androidinvaders.ui.theme.AndroidInvadersTheme
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            AndroidInvadersTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->

                    Geral(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Geral(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {

        ScoreLives()
        AndroidsColumn()
    }
}

@Composable
fun ScoreLives(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween

    ) {

        Text(
            text = "Score: 0050",
            color = Color.White
        )

        Row () {

            Text(
                text = "Lives:",
                color = Color.White
            )

            Android(
                modifier = Modifier.size(25.dp),
                color = Color.Green
            )

            Android(
                modifier = Modifier.size(25.dp),
                color = Color.Green
            )

            Android(
                modifier = Modifier.size(25.dp),
                color = Color.Green

            )
        }
    }
}
@Composable
fun AndroidsColumn(
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),


    ) {


        Row(
            modifier = modifier.fillMaxSize(),
           horizontalArrangement = Arrangement.Center
        ) {

            Android(
                modifier = Modifier.size(75.dp),
                color = Color.Green
            )

            Android(
                modifier = Modifier.size(75.dp),
                color = Color.Red
            )

            Android(
                modifier = Modifier.size(75.dp),
                color = Color.Blue
            )

            Android(
                modifier = Modifier.size(75.dp),
                color = Color.Yellow
            )

            Android(
                modifier = Modifier.size(75.dp),
                color = Color.Green
            )
        }
    }
}

@Composable
fun Android(
    modifier: Modifier = Modifier,
    color: Color
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color),
        contentDescription = "Android Enemy"
    )
}



