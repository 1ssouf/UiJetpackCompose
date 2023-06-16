package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyTopAppBar(){
    TopAppBar (
        {
            Box(modifier = Modifier.fillMaxWidth())
            {
                Text(
                    text = "issmoi",
                    fontWeight = FontWeight.ExtraBold,
                    modifier = Modifier.align(Alignment.CenterStart)
                )
                Icon(
                    imageVector = Icons.Default.Info,
                    contentDescription = "info",
                    modifier = Modifier.align(Alignment.CenterEnd)
                )
            }
        }
    )
}


