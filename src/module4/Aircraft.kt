package module4

import kotlin.math.roundToInt

abstract class Aircraft(protected val number: String, protected val maxFlightRange: Double, protected val tankCapacity: Double) {
    protected val fuelConsumption: Double
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

    open fun info() {
        println("Номер воздушного судна: $number\nМаксимальная дальность полета: $maxFlightRange\n" +
                "Вместимость бака: $tankCapacity\nРасход топлива на 100 км: $fuelConsumption")
    }
}