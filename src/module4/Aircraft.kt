package module4

import kotlin.math.roundToInt

class Aircraft {
    var number: String = "318-100"
    var maxFlightRange: Double = 6000.0
    var tankCapacity: Double = 23860.0
    var fuelConsumption: Double = 420.0
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

}