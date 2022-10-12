fun main() {
//    task1()
//    task2()
//    task3()
//    task4()
//    task5()
    task6()
}

//Задание 1 Тип Double
fun task1() {
    val a: Any?
    a = 7
    val b = a / 2.5
    println(b)
}

//Задание 2
fun task2() {
    val text1 = "hello"
    val text2 = "aplana"
    println("$text1 $text2")
}

//Задание 3
fun task3() {
    val five: Char = '5'
    println(five.toString())
    println(five.toByte())
    println(five.toShort())
    println(five.toInt())
    println(five.toDouble())
    println(five.toFloat())
    println(five.toLong())
}

//Задание 4
fun task4() {
    println("Введите имя и нажмите Enter")
    val name = readLine()
    println("$name, добро пожаловать!")
}

//Задание 5
fun task5() {
    val alphabet = ('Z' downTo 'A')
    for (n in alphabet) print("$n ")
}

//Задание 6
fun task6() {
    println("Введите первое целое число и нажмите Enter")
    val a = readLine().toString()
    println("Введите второе целое число и нажмите Enter")
    val b = readLine().toString()
    val value = a.toInt() > b.toInt()
    println(value)
}
