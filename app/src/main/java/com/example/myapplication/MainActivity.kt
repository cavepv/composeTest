package com.example.myapplication

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.Conversation
import com.example.myapplication.ui.theme.CustomMessage
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.example.myapplication.ui.theme.SampleData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    // Greeting("Hello World compose test")
                    Conversation(SampleData.conversationSample)
                }
            }
        }
    }
}


@Preview(
    name = "lightMode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun LightModePreview() {
    MyApplicationTheme{
        Surface{
            CustomMessage(message = CustomMessage("Title", "hello composable world"))
        }
    }
}

@Preview(
    name = "darkMode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun DarkModePreview() {
    MyApplicationTheme{
        Surface{
            CustomMessage(message = CustomMessage("Title", "hello composable world"))
        }
    }
}

@Preview
@Composable
fun PreviewConversation() {
    MyApplicationTheme {
        Conversation(SampleData.conversationSample)
    }
}

