package module4

import kotlin.math.roundToInt

abstract class Aircraft(val number: String, val maxFlightRange: Double, val tankCapacity: Double) {
    val fuelConsumption: Double
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

}