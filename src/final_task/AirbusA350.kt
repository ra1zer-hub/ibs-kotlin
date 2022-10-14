package final_task

class AirbusA350(number: String, maxFlightRange: Double, tankCapacity: Double, override val passengerCapacity: Int) :
    Aircraft(number, maxFlightRange, tankCapacity), Passenger {
    override fun info() {
        super.info()
        println("Вместимость пассажиров: $passengerCapacity")
    }
}