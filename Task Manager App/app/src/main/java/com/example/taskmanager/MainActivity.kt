package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskImage(
                        heading = stringResource(R.string.task_heading),
                        subHeading = stringResource(R.string.task_subHeading)
                    )
                }
            }
        }
    }
}

@Composable
fun TaskText(heading: String, subHeading: String, modifier: Modifier = Modifier) {
    Text(
        text = heading,
        textAlign = TextAlign.Center,
        fontWeight = FontWeight.Bold,
        modifier = modifier
            .padding(
                top = 24.dp,
                bottom = 8.dp
            )
            .fillMaxWidth()
    )
    Text(
        text = subHeading,
        textAlign = TextAlign.Center,
        fontSize = 16.sp,
        modifier = modifier
            .fillMaxWidth()

    )
}

@Composable
fun TaskImage(heading: String, subHeading: String, modifier: Modifier = Modifier)  {
    val image = painterResource(R.drawable.ic_task_completed)
    Box(
        modifier = modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            verticalArrangement = Arrangement.Center,

            //        horizontalAlignment = Arrangement.Center,
        ) {
            Image(
                painter = image,
                contentDescription = null,
                modifier = modifier
                    .fillMaxWidth()
            )
            TaskText(
                heading = heading,
                subHeading = subHeading
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun TaskPreview() {
    TaskManagerTheme {
        TaskImage(
            heading = stringResource(R.string.task_heading),
            subHeading = stringResource(R.string.task_subHeading)
        )
    }
}