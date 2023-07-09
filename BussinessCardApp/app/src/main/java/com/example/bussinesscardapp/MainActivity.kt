package com.example.bussinesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Call
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bussinesscardapp.ui.theme.BussinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BussinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column (
        modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

            ) {
        FirstContainer()
        Column(
            Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SecoundContainer()

        }
    }
}

@Composable
fun FirstContainer(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = image,
            contentDescription = null,
            Modifier
                .background(Color(0xFF073042))
                .width(150.dp)
                .height(150.dp)
            )
        Text(
            text = "Jennifer Doe",
            modifier = modifier,
            fontSize = 46.sp,
        )
        Text(
            text = "Android Developer Extraordinaire",
            fontSize = 16.sp,
            modifier = modifier,
            color = Color(0xFF1D7C4D),
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun SecoundContainer(modifier: Modifier = Modifier) {
    Column (
        Modifier.fillMaxWidth()
        .padding(top = 150.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start
        ) {
            Row {
                Icon(
                    Icons.Rounded.Call,
                    contentDescription = null,
                    tint = Color(0xFF1D7C4D)
                )
                Text(
                    text = "+11 (123) 444 555 66",
                    modifier = modifier.padding(start = 15.dp),
                )
            }
            Row(
                Modifier.padding(top = 16.dp)
            ) {
                Icon(
                    Icons.Rounded.Share,
                    contentDescription = null,
                    tint = Color(0xFF1D7C4D)
                )
                Text(
                    text = "@AndroidDev",
                    modifier = modifier.padding(start = 15.dp),
                )
            }
            Row(
                Modifier.padding(top = 16.dp)
            ) {
                Column() {
                    Icon(
                        Icons.Rounded.Email,
                        contentDescription = null,
                        tint = Color(0xFF1D7C4D)
                    )
                }
                Column() {
                    Text(
                        text = "john.doe@android.com",
                        modifier = modifier.padding(start = 15.dp),
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BussinessCardAppTheme {
        Greeting("Android")
    }
}