package be.issouf.uitableaudebord

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import be.issouf.uitableaudebord.composables.Screen
import be.issouf.uitableaudebord.ui.theme.UiTableauDeBordTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UiTableauDeBordTheme {
                Screen()

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UiTableauDeBordTheme {

    }
}