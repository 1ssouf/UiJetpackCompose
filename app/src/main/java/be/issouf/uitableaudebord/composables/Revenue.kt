package be.issouf.uitableaudebord.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import be.issouf.uitableaudebord.data.Data
import be.issouf.uitableaudebord.model.DataRevenu

@Composable
fun Revenue(listDataRevenu: List<DataRevenu> = Data.revenuData){
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
    ) {
        Text(
            text = "Vos revenus",
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Bold,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 8.dp)

        )
        Text(
            text = "3 derniers mois :",
            style = MaterialTheme.typography.bodyLarge,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(horizontal = 8.dp)
        )
        Card(
            modifier = Modifier.padding(8.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Column(modifier = Modifier.padding(8.dp)) {
                val maxValue = listDataRevenu.maxBy { 
                    it.amount
                }
                listDataRevenu.forEach{
                    RevenuByMonthItem(
                        revenueData = it,
                        ratio = it.amount/maxValue.amount
                    )
                }

            }

        }
        
    }

}

@Composable
fun RevenuByMonthItem(revenueData : DataRevenu, ratio : Float){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = revenueData.month,
            overflow = TextOverflow.Ellipsis,
            softWrap = false,
            modifier = Modifier.weight(1f),
        )
        Row(modifier = Modifier
            .weight(2f)
            .fillMaxWidth()
            .padding(vertical = 5.dp)) {
            Box(modifier = Modifier
                .height(20.dp)
                .fillMaxWidth(ratio)
                .clip(RoundedCornerShape(50))
                .background(MaterialTheme.colorScheme.primary)
            ){

            }
        }
        Text(
            text = "${revenueData.amount} €",
            modifier = Modifier.weight(1f),
            textAlign = TextAlign.End
            )
        
    }

}

@Preview(showBackground = true)
@Composable
fun RevenuePreview(){
    Revenue()
}