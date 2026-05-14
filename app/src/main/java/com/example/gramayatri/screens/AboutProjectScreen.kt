package com.example.gramayatri.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AboutProjectScreen(onBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE0F7FA))
            .verticalScroll(rememberScrollState())
            .padding(20.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Text(
            text = "ℹ️ About Project",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF006064)
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = "Grama-Yatri - Community Bus Tracker",
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF444444)
        )

        Spacer(modifier = Modifier.height(24.dp))

        SectionTitle("🧩 Problem Statement")
        SectionText(
            "Wait times for village buses are unpredictable. Passengers often miss the bus by a few minutes and may need to wait for hours for the next one."
        )

        SectionTitle("🎯 Vision")
        SectionText(
            "Grama-Yatri is a shared transit log where passengers can report bus movement. The app uses these reports to show estimated arrival times for villages on the route."
        )

        SectionTitle("✨ Main Features")
        SectionText(
            "Route view, bus ping, live ETA, user-reported alert, source of report, and low-data simple interface."
        )

        SectionTitle("🌱 Impact Goals")
        SectionText(
            "The app improves rural mobility, reduces wasted waiting time, and helps students and workers reach destinations on time."
        )

        SectionTitle("🛠 Technology Used")
        SectionText(
            "Kotlin, Jetpack Compose, Android Studio, and local sample data."
        )

        Spacer(modifier = Modifier.height(24.dp))

        OutlinedButton(
            onClick = onBack,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.outlinedButtonColors(
                contentColor = Color(0xFF006064)
            )
        ) {
            Text(text = "⬅ Back to Dashboard")
        }
    }
}

@Composable
fun SectionTitle(title: String) {
    Text(
        text = title,
        fontSize = 18.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFF006064)
    )

    Spacer(modifier = Modifier.height(6.dp))
}

@Composable
fun SectionText(text: String) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = Color(0xFF444444)
    )

    Spacer(modifier = Modifier.height(18.dp))
}
