package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import be.issouf.uitableaudebord.R

@Composable
fun Profile(){
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    ) {
        Surface(modifier = Modifier
            .size(70.dp)
            .clip(
                RoundedCornerShape(50)
            )) {
            Image(
                painter = painterResource(id = R.drawable.profile),
                contentDescription = null)
            
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(
                text = "Issouf Bello",
                style = MaterialTheme.typography.titleMedium
            )
            Text(
                text = "109",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.ExtraBold
            )
            Text(
                text = "Nombre total de points",
                style = MaterialTheme.typography.bodySmall,
            )
            
        }

    }

}

@Preview(showBackground = true)
@Composable
fun ProfileVeiw() {
    Profile()
}