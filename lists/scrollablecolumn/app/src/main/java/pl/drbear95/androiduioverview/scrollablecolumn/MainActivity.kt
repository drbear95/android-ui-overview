package pl.drbear95.androiduioverview.scrollablecolumn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Checkbox
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.drbear95.androiduioverview.scrollablecolumn.ui.theme.ScrollableColumnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ScrollableColumnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        repeat(100) {
            Row {
                Image(
                    painterResource(R.drawable.ic_launcher_round),
                    contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .width(100.dp)
                        .height(100.dp)
                )
                Column(modifier = Modifier
                    .width(250.dp)
                    .height(IntrinsicSize.Max)) {
                    Text(text = "Sample Text 1")
                    Text(text = "Sample Text 2")
                }
                Checkbox(checked = true, onCheckedChange ={})
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ScrollableColumnTheme {
        Main()
    }
}