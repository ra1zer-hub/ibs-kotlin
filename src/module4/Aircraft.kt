package module4

import kotlin.math.roundToInt

class Aircraft(var number: String, var maxFlightRange: Double, var tankCapacity: Double) {
    var fuelConsumption: Double = 420.0
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

}