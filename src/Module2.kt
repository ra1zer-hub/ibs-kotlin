import java.util.*

fun main() {
//    task7()
//    task8()
//    task9()
//    task10()
    task11()
}

//Задание 7
fun task7() {
    var points = 0
    println("Введите цифру вашего ответа")

    println("Сколько в году месяцев, имеющих 28 дней?")
    println("1 - один, 2 - пять, 3 - девять, 4 - двенадцать")
    val question1 = readLine()
    if (question1 == "4") points++

    println("4+4*4=?")
    println("1 - 16, 2 - 20, 3 - 32")
    val question2 = readLine()
    if (question2 == "2") points++

    println("Сколько цветов у радуги?")
    println("1 - 5, 2 - 6, 3 - 7, 4- 8")
    val question3 = readLine()
    if (question3 == "3") points++

    println("Сколько молочных зубов у человека?")
    println("1 - 32, 2 - ни одного, 3 - 32, 4 - 20")
    val question4 = readLine()
    if (question4 == "4") points++

    println("Какая гора считается самой высокой?")
    println("1 - Эльбрус, 2 - Эверест, 3 - Арарат")
    val question5 = readLine()
    if (question5 == "2") points++

    when (points) {
        0 -> println("Ни одного правильного ответа")
        1 -> println("Один правильный ответ")
        2 -> println("Два правильных ответа")
        3 -> println("Три правильных ответа")
        4 -> println("Четыре правильных ответа")
        5 -> println("Все ответы правильные")
    }
}

//Задание 8
fun task8() {
    println("Введите сумму вклада")
    val sum = readLine()!!.toDouble()
    println("Введите длительность вклада в месяцах")
    val duration = readLine()!!.toInt()
    println("Введите ежемесячный процент по вкладу")
    val percent = readLine()!!.toDouble()

    var month = 1
    var totalSum = sum
    while (month <= duration) {
        val additionalAmount = totalSum * (percent / 100)
        totalSum += additionalAmount
        println(
            "В $month месяце вклад увеличиться на " + "%.2f".format(additionalAmount) +
                    ". Итоговая сумма вклада в $month месяце составит " + "%.2f".format(totalSum)
        )
        month++
    }
}

//Задание 9
fun task9() {
    val table = arrayOf(
        arrayOf("Россия", "Москва", "RUB"),
        arrayOf("США", "Вашингтон", "USD"),
        arrayOf("Германия", "Берлин", "EUR"),
        arrayOf("Китай", "Пекин", "CNY")
    )
    for (array in table)
        println(array.contentDeepToString())
}

//Задание 10
fun task10() {
    val cities = arrayListOf<String>()

    while (true) {
        println(
            "Выберите действие: 1 - Добавить название города в программу, 2 - Посмотреть список всех добавленных городов, " +
                    "3 - Посмотреть список добавленных городов без повторений, 4 - Выход из программы"
        )
        when (readLine()!!.toInt()) {
            1 -> {
                print("Введите название города: ")
                cities.add(readLine()!!.toString())
            }
            2 -> println(cities)
            3 -> {
                val uniqueCities: HashSet<String> = hashSetOf()
                uniqueCities.addAll(cities)
                println(uniqueCities)
            }
            4 -> break
            else -> println("Не верное значение")
        }
    }
}

//Задание 11
fun task11() {
    val workplaces = hashMapOf(101 to "Петров Д.В.", 102 to "Иванов С.Ф.", 103 to "Сидоров М.О.", 104 to "Бочкин И. А.")
    println("Введите номер рабочего места, чтобы узнать кто его занимает")
    val value = readLine()!!.toInt()
    println(workplaces.getOrDefault(value, "Рабочее место отсутствует или свободно"))
}