package Lesson1_task2

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.
fun main() {
    val minutesSpace:Byte = 108
    val secondsSpace:Short = 6480
    val hours = "01"
    val minutes = 30
    val seconds = "09"
    println(" Гагарин провел в космосе $hours:$minutes:$seconds")
    println("Юрий Гагарин провёл в космосе $minutesSpace минут, что составляет $secondsSpace секунд.")
}