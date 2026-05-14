package com.example.gramayatri.data

data class BusStop(
    val name: String,
    val minutesFromStart: Int
)

fun getVillageRoute(): List<BusStop> {
    return listOf(
        BusStop("Main Bus Stand", 0),
        BusStop("Market Circle", 5),
        BusStop("Government School", 10),
        BusStop("Health Center", 15),
        BusStop("Hanuman Temple", 22),
        BusStop("River Bridge", 30),
        BusStop("Kere Village", 38),
        BusStop("College Gate", 48)
    )
}
