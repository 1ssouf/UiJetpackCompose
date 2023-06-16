package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import be.issouf.uitableaudebord.ui.theme.UiTableauDeBordTheme

@Composable
fun MyBottomAppBar(){
    NavigationBar() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround,
            modifier = Modifier.fillMaxSize()
        ) {
            BottomMenuItem(
                icon = Icons.Default.Home,
                titre = "maison")
            BottomMenuItem(
                icon = Icons.Default.List,
                titre = "Contenu")
            BottomMenuItem(
                icon = Icons.Default.CheckCircle,
                titre = "Analise")
            BottomMenuItem(
                icon = Icons.Default.Email,
                titre = "Commantaire")
        }
        
    }

}
@Composable
fun BottomMenuItem(icon : ImageVector, titre : String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.size(width = 68.dp, height = 40.dp)
        ) {
        Icon(imageVector = icon, contentDescription = null)
        Text(
            text = titre,
            overflow = TextOverflow.Ellipsis,
            style = MaterialTheme.typography.titleMedium
            )

    }
}


@Preview(showBackground = true)
@Composable
fun MyBottomPaaBarP() {
    MyBottomAppBar()
}