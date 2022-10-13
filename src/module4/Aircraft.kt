package module4

import kotlin.math.roundToInt

open class Aircraft(val number: String, val maxFlightRange: Double, val tankCapacity: Double) {
    var fuelConsumption: Double = 420.0
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

}