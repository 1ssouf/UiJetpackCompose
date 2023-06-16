package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import be.issouf.uitableaudebord.data.Data
import be.issouf.uitableaudebord.model.Content

@Composable
fun LastContent(listLastContent : List<Content> = Data.lastContent){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(8.dp)) {
        Text(
            text = "Vos derniers achat",
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Bold,
            softWrap = false,
            overflow = TextOverflow.Ellipsis
            )
        Spacer(modifier = Modifier.height(8.dp))

        listLastContent.forEach{
            LastContentItem(it)
        }

    }
}

@Composable
fun LastContentItem(content: Content) {
    Column(modifier = Modifier.padding(8.dp)) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ){
            Icon(
                imageVector = Icons.Default.KeyboardArrowDown,
                contentDescription = null,
                tint = Color.Red,
            )
            Row() {
                Column {
                    Text(
                        text = content.titel,
                        style = MaterialTheme.typography.bodySmall,
                        softWrap = false,
                        fontWeight = FontWeight.Bold,
                        overflow = TextOverflow.Ellipsis
                    )
                    Text(
                        text = content.duration,
                        fontWeight = FontWeight.Light,
                        softWrap = false,
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.Center
                ) {
                Text(
                    text = "${content.price}€",
                    style = MaterialTheme.typography.bodySmall,
                    )
                }
            }


        }

    }
}


@Preview(showBackground = true)
@Composable
fun ContentPreview(){
    LastContent()
}
