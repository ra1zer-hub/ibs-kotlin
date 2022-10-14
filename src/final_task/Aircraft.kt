package final_task

import kotlin.math.roundToInt

abstract class Aircraft(protected val number: String, protected val maxFlightRange: Double, protected val tankCapacity: Double) {
    protected val fuelConsumption: Double
        get() = ((tankCapacity / (maxFlightRange / 100)) * 10).roundToInt() / 10.0

    open fun info() {
        print("Номер воздушного судна: $number, Максимальная дальность полета: $maxFlightRange, " +
                "Вместимость бака: $tankCapacity, Расход топлива на 100 км: $fuelConsumption, ")
    }
}