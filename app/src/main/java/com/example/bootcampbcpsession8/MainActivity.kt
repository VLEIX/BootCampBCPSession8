package com.example.bootcampbcpsession8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bootcampbcpsession8.ui.theme.BootCampBCPSession8Theme
import org.w3c.dom.NameList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp {
                //MyScreenContent(names = listOf("Item 1", "Item 2", "Item 3"))
                NameList(names = listOf("Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo", "Daniela", "Danny", "Gerardo"))
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {
    BootCampBCPSession8Theme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
            content()
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        color = Color.Blue,
        modifier = Modifier
            .background(color = Color.Green)
            .fillMaxWidth()
            .padding(24.dp)
    )
}

@Composable
fun MyScreenContent(names: List<String>) {
    Column(modifier = Modifier.fillMaxHeight()) {
        names.forEach {
            Greeting(it)
            Divider(color = Color.Black)
        }
        Login()
    }
}

@Composable
fun Login() {
    Button(onClick = { /*TODO*/ }) {
        Text(text = "Login user")
    }
}

@Composable
fun NameList(names: List<String>) {
    LazyColumn {
        items(items = names) {
            Greeting(it)
            Divider(color = Color.Black)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BootCampBCPSession8Theme {
        Greeting("Android")
    }
}