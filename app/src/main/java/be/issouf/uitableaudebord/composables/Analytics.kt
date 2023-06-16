package be.issouf.uitableaudebord.composables

import android.provider.CalendarContract.Colors
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.issouf.uitableaudebord.data.Data
import be.issouf.uitableaudebord.model.DataAnalytic


@Composable
fun Analytics(listDataAnalytic : List<DataAnalytic> = Data.analyticData){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically)
        {
            Text(
                text = "Donner Analytique de Issouf kdkdkdkdkkdkdkdkdkkkdkdkdkdkd",
                style = MaterialTheme.typography.titleSmall,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.weight(2F),
                softWrap = false,
                overflow = TextOverflow.Ellipsis
                )
            Text(
                text = "20 derniers jours",
                textAlign = TextAlign.End,
                modifier = Modifier
                    .size(height = 20.dp, width = 100.dp)
                    .weight(1F)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Row {
            listDataAnalytic.forEach{
                CardElement(dataAnalytic = it, modifier = Modifier.weight(1f))
            }


        }

    }
}

@Composable
fun CardElement(dataAnalytic : DataAnalytic, modifier: Modifier = Modifier){
    Card(shape = RoundedCornerShape(8.dp), modifier = modifier) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = dataAnalytic.title,
                style = MaterialTheme.typography.bodyLarge
            )
            Row {
                Text(
                    text = dataAnalytic.value,
                    style = MaterialTheme.typography.bodySmall
                )
                Icon(
                    imageVector = Icons.Default.KeyboardArrowDown,
                    contentDescription = null,
                    tint = Color.Red)

            }

        }

    }
}


@Preview(showBackground = true)
@Composable
fun AnalyticVeiw() {
    Analytics()
}