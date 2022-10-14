package final_task


fun main() {
    val aircraft1 = Boeing747("318-100", 6000.0, 23860.0, 900)
    val aircraft2 = AirbusA350("350-XWB", 6350.0, 21720.0, 800)
    val aircraft3 = An22("RUS-001", 4500.0, 17100.0, 80000)
    val aircraft = arrayListOf(aircraft1, aircraft2, aircraft3)


    println("Введите номер команды:")
    println(
        "1 - вывести информацию о всех имеющихся самолетах, 2 - вывести информацию только о пассажирских самолетах, " +
                "3 - вывести информацию только о грузовых самолетах\n4 - вывести информацию о Boeing 747, " +
                "5 - вывести информацию о Airbus A350, 6 - вывести информацию о Ан-22"
    )

    when (readLine()!!.toInt()) {
        1 -> for (air in aircraft) air.info()
        2 -> for (air in aircraft) if (air is Passenger) air.info()
        3 -> for (air in aircraft) if (air is Cargo) air.info()
        4 -> aircraft[0].info()
        5 -> aircraft[1].info()
        6 -> aircraft[2].info()
    }
}