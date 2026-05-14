package com.example.gramayatri.data

import android.content.Context

fun saveBusStatus(
    context: Context,
    currentMinutes: Int,
    source: String
) {
    val sharedPreferences = context.getSharedPreferences("bus_status", Context.MODE_PRIVATE)

    sharedPreferences.edit()
        .putInt("current_minutes", currentMinutes)
        .putString("source", source)
        .apply()
}

fun getBusCurrentMinutes(context: Context): Int {
    val sharedPreferences = context.getSharedPreferences("bus_status", Context.MODE_PRIVATE)
    return sharedPreferences.getInt("current_minutes", 10)
}

fun getBusReportSource(context: Context): String {
    val sharedPreferences = context.getSharedPreferences("bus_status", Context.MODE_PRIVATE)
    return sharedPreferences.getString("source", "Reported by Ravi at Government School") ?: "Reported by Ravi at Government School"
}
