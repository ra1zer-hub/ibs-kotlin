import kotlin.math.sqrt

fun main() {
//    task12(2022)
//    task13("Антон", "Дмитрий", "Сергей", "Павел", "Максим")
//    task14("Иванов М.А.", 35, "Женат","Начальник")
//    task15()
    task16(121.0, fun(x: Double): Double { return sqrt(x) })
}

//Задание 12
fun task12(year: Int) {
    val leapYear: Boolean = if (year % 4 == 0) {
        if (year % 100 == 0) {
            year % 400 == 0
        } else true
    } else false
    println(if (leapYear) "$year год високосный." else "$year год не високосный.")
}

//Задание 13
fun task13(vararg names: String) {
    var result = 0
    for (name in names) {
        result++
    }
    println("Количество сотрудников: $result")
}

//Задание 14
fun task14(FIO: String, position: String) = println("ФИО: $FIO, должность: $position")

fun task14(FIO: String, age: Int, position: String) = println("ФИО: $FIO, возраст: $age, должность: $position")

fun task14(FIO: String, maritalStatus: String, position: String) =
    println("ФИО: $FIO, семейное положение: $maritalStatus, должность: $position")

fun task14(FIO: String, age: Int, maritalStatus: String, position: String) =
    println("ФИО: $FIO, возраст: $age, семейное положение: $maritalStatus, должность: $position")


//Задание 15
fun task15() {
    val printer = { array: Array<String> -> for (value in array) println(value) }
    val array = arrayOf("1", "2", "3", "4")
    printer(array)
}

//Задание 16
fun task16(x: Double, op: (Double) -> Double) {
    println(op(x))
}