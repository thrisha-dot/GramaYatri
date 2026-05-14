package com.example.gramayatri

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.gramayatri.screens.AboutProjectScreen
import com.example.gramayatri.screens.AlertScreen
import com.example.gramayatri.screens.DashboardScreen
import com.example.gramayatri.screens.LiveEtaScreen
import com.example.gramayatri.screens.PingBusScreen
import com.example.gramayatri.screens.RouteScreen
import com.example.gramayatri.ui.theme.GramaYatriTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appContext = this

        setContent {
            GramaYatriTheme {
                var currentScreen by remember { mutableStateOf("dashboard") }

                when (currentScreen) {
                    "dashboard" -> DashboardScreen(
                        context = appContext,
                        onOpenRoute = {
                            currentScreen = "route"
                        },
                        onOpenPing = {
                            currentScreen = "ping"
                        },
                        onOpenEta = {
                            currentScreen = "eta"
                        },
                        onOpenAlert = {
                            currentScreen = "alert"
                        },
                        onOpenAbout = {
                            currentScreen = "about"
                        }
                    )

                    "route" -> RouteScreen(
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "ping" -> PingBusScreen(
                        context = appContext,
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "eta" -> LiveEtaScreen(
                        context = appContext,
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "alert" -> AlertScreen(
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )

                    "about" -> AboutProjectScreen(
                        onBack = {
                            currentScreen = "dashboard"
                        }
                    )
                }
            }
        }
    }
}

