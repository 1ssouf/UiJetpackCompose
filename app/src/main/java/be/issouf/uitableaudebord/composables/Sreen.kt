package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen(){
    Scaffold(
        topBar = {
                 MyTopAppBar()
        },
        bottomBar = {
            MyBottomAppBar()

        }
    ) {
        Column(modifier = Modifier.padding(it)) {
            Profile()
            Analytics()
            Revenue()
            LastContent()
            
        }
        
    }
}

@Preview(showBackground = true)
@Composable
fun ScreePreview(){
    Screen()
}