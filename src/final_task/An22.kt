package final_task

class An22(number: String, maxFlightRange: Double, tankCapacity: Double, override val loadCapacity: Int) :
    Aircraft(number, maxFlightRange, tankCapacity), Cargo {
    override fun info() {
        super.info()
        println("Грузоподъёмность: $loadCapacity")
    }
}