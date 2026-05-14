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
import com.example.gramayatri.data.saveBusStatus

@Composable
fun PingBusScreen(
    context: Context,
    onBack: () -> Unit
) {
    var message by remember {
        mutableStateOf("No bus ping yet.")
    }

    var reportSource by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF3E0))
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "🚌 Ping Bus",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFFE65100)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Report live bus movement for your village route",
            fontSize = 16.sp,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(28.dp))

        Button(
            onClick = {
                saveBusStatus(
                    context = context,
                    currentMinutes = 0,
                    source = "Reported by You at Main Bus Stand"
                )

                message = "Bus is currently starting from Main Bus Stand."
                reportSource = "Reported by You"
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF2E7D32),
                contentColor = Color.White
            )
        ) {
            Text(text = "✅ I am on the bus")
        }

        Spacer(modifier = Modifier.height(12.dp))

        Button(
            onClick = {
                saveBusStatus(
                    context = context,
                    currentMinutes = 10,
                    source = "Reported by You at Government School"
                )

                message = "Bus just passed Government School."
                reportSource = "Reported by You"
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFEF6C00),
                contentColor = Color.White
            )
        ) {
            Text(text = "📍 Bus just passed me")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Text(
            text = message,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF333333)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = reportSource,
            fontSize = 16.sp,
            color = Color(0xFF555555)
        )

        Spacer(modifier = Modifier.height(28.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFFE65100)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}
