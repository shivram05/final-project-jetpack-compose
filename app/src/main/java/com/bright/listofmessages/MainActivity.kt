package com.bright.listofmessages

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bright.listofmessages.adapter.MessageCard
import com.bright.listofmessages.constant.MessageConstant.messageListData
import com.bright.listofmessages.model.Message
import com.bright.listofmessages.ui.theme.ListOfMessagesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListOfMessagesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Conversation(
                       messageListData()
                    )
                }
            }
        }
    }
}

@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {
        items(messages) {message -> MessageCard(message)}
    }
}

@Preview(showBackground = true)
@Composable
fun ConversationPreview() {
    ListOfMessagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Conversation(
                listOf(
                    Message("author1", "The conversation is getting more interesting. It's time to play with animations! You will add the ability to expand a message to show a longer one, animating both the content size and the background color."),
                    Message("author2", "Composable functions can store local state in memory by using remember, and track changes to the value passed to mutableStateOf. Composables (and their children) using this state will get redrawn automatically when the value is updated. "),
                    Message("author3", "Android Compose revolutionizes the way developers create user interfaces for Android applications. With its declarative syntax, developers can describe UI components in a more intuitive and concise manner, focusing on what should be displayed rather than how it should be rendered. "),
                    Message("author4", "By encapsulating mutable state within composable functions, Compose ensures that UI components automatically update when the underlying state changes, eliminating the need for manual synchronization and reducing the risk of bugs. ")
                )
            )
        }
    }
}