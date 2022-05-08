package pl.drbear95.androiduioverview.basiccontrolscompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pl.drbear95.androiduioverview.basiccontrolscompose.ui.theme.BasicControlsComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicControlsComposeTheme {
                Scaffold(
                    floatingActionButton = {
                        FloatingActionButton(
                            onClick = {}
                        ) {
                            Icon(Icons.Filled.Add,"")
                        }
                    }
                ) {
                    Content()
                }
            }
        }
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
    ) {
        Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(top = 8.dp, bottom = 4.dp)
                .fillMaxWidth()
        ) {
            Column {
                Text(text = "Dane logowania", modifier = Modifier.padding(top = 4.dp, start = 8.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Login") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Hasło") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
                )
            }
        }
        Card(
            elevation = 4.dp,
            modifier = Modifier
                .padding(top = 4.dp, bottom = 8.dp)
                .fillMaxWidth()
        ) {
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Dane użytkownika", modifier = Modifier.padding(top = 4.dp, start = 8.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Imie") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Nazwisko") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Data urodzenia") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Ulica") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Numer domu") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Miasto") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Kod pocztowy") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Kraj") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Numer telefonu") },
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth(),
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = { Text("Email") },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
                    modifier = Modifier
                        .padding(8.dp)
                        .fillMaxWidth()
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicControlsComposeTheme {
        Content()
    }
}