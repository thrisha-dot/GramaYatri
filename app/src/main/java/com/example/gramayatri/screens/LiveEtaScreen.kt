package com.example.gramayatri.screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gramayatri.data.getBusCurrentMinutes
import com.example.gramayatri.data.getBusReportSource

@Composable
fun LiveEtaScreen(
    context: Context,
    onBack: () -> Unit
) {
    val currentMinutes = getBusCurrentMinutes(context)
    val source = getBusReportSource(context)

    val etaToTempleStop = 15 - currentMinutes
    val etaToMarketStop = 25 - currentMinutes
    val etaToVillageEnd = 35 - currentMinutes

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE3F2FD))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "⏱ Live ETA",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47A1)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Estimated arrival based on latest bus report",
            fontSize = 16.sp,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = "Temple Stop: ${etaToTempleStop.coerceAtLeast(0)} minutes",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Market Stop: ${etaToMarketStop.coerceAtLeast(0)} minutes",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = "Village End: ${etaToVillageEnd.coerceAtLeast(0)} minutes",
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Text(
            text = source,
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(28.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF0D47A1)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}
