package module4

class Boeing747(number: String, maxFlightRange: Double, tankCapacity: Double, override val passengerCapacity: Int) :
    Aircraft(number, maxFlightRange, tankCapacity), Passenger {

    }