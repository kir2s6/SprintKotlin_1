package Lesson1_task2

//Объяви переменную с количеством секунд, которые Гагарин провел в космосе.
//
//- Переведи в коде количество секунд в целые минуты и целые часы, сохраняя остаток секунд и минут в новые переменные;
//- Выведи в консоль время, проведенное в космосе в формате [часы:минуты:секунды], например так: 01:30:09;
//- Значения часов, минут и секунд отображать двумя цифрами.
fun main() {
    val secondsSpace: Short = 6480
    val hoursSpase = secondsSpace / 3600
    val remaining = secondsSpace % 3600
    val minutes = remaining / 60
    val seconds = remaining % 60

    println(" Гагарин провел в космосе $hoursSpase:$minutes:$seconds")
    println("Юрий Гагарин провёл в космосе $minutes минут, что составляет $secondsSpace секунд.")

}