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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gramayatri.data.getBusReportSource

@Composable
fun DashboardScreen(
    context: Context,
    onOpenRoute: () -> Unit,
    onOpenPing: () -> Unit,
    onOpenEta: () -> Unit,
    onOpenAlert: () -> Unit,
    onOpenAbout: () -> Unit
) {
    val latestSource = getBusReportSource(context)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE8F5E9))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "🚌 Grama-Yatri",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.height(6.dp))

        Text(
            text = "Community-powered village bus tracker",
            fontSize = 16.sp,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(18.dp))

        Text(
            text = "Latest bus report:",
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1B5E20)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = latestSource,
            fontSize = 15.sp,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(26.dp))

        Button(
            onClick = onOpenRoute,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32),
                contentColor = Color.White
            )
        ) {
            Text(text = "📍 View Route")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenPing,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF6C00),
                contentColor = Color.White
            )
        ) {
            Text(text = "🚌 Ping Bus")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenEta,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF1565C0),
                contentColor = Color.White
            )
        ) {
            Text(text = "⏱ Live ETA")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenAlert,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC62828),
                contentColor = Color.White
            )
        ) {
            Text(text = "⚠ Report Alert")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = onOpenAbout,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF006064),
                contentColor = Color.White
            )
        ) {
            Text(text = "ℹ️ About Project")
        }
    }
}

