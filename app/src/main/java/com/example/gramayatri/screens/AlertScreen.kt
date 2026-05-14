package com.example.gramayatri.screens

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
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlertScreen(onBack: () -> Unit) {
    var alertMessage by remember {
        mutableStateOf("No active alerts.")
    }

    var source by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFEBEE))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "⚠ Report Alert",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFB71C1C)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Share urgent route updates with passengers",
            fontSize = 16.sp,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Button(
            onClick = {
                alertMessage = "Morning bus is cancelled today."
                source = "Reported by You"
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFC62828),
                contentColor = Color.White
            )
        ) {
            Text(text = "🚫 Bus Cancelled")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                alertMessage = "Bus is delayed by 20 minutes."
                source = "Reported by You"
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF6C00),
                contentColor = Color.White
            )
        ) {
            Text(text = "⏳ Bus Delayed")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                alertMessage = "Bus is running normally."
                source = "Reported by You"
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32),
                contentColor = Color.White
            )
        ) {
            Text(text = "✅ Bus Running")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = alertMessage,
            fontSize = 21.sp,
            fontWeight = FontWeight.Bold,
            color = if (alertMessage.contains("cancelled", ignoreCase = true)) {
                Color(0xFFC62828)
            } else {
                Color(0xFF333333)
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

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
                contentColor = Color(0xFFB71C1C)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}
