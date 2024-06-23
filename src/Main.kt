fun main() {
    /**
     * 1 Задание. Дан список целых чисел от 1 до 20 включительно. Посчитать количество четных чисел списка, начиная с
     * 5 элемента до конца списка. Целесообразно использовать функции drop(), count().
     */
    println("\n***1 ЗАДАНИЕ****\n")
    val numbersList = (1..20).toList()
    println("$numbersList\n")
    println(numbersList.drop(4).count { it % 2 == 0 })
    /**
     * 2 Задание.  Дан список целых чисел от 1 до 20 включительно. Посчитать сумму первых 7 чисел списка, Целесообразно
     * использовать функции take(), sum().
     */
    println("\n***2 ЗАДАНИЕ****\n")
    println(numbersList.take(7).sum())
    /**
     * 3 Задание.  Дан список строк: {"one", "two", "three"}. Необходимо получить и вывести в консоль список вида:
     * [o, n, e, t, w, o, t, h, r, e, e]. Целесообразно использовать функции map(), flatten().
     */
    // flatten() не работает у меня почему-то, не разобрался.
    println("\n***3 ЗАДАНИЕ****\n")
    val strokeList = listOf("one", "two", "three")
    println(strokeList.joinToString(separator = "").map { it.toChar() })
    /**
     * 4 Задание. Дан список строк. Найти строку максимальной длины. Целесообразно использовать агрегатные операции.
     */
    println("\n***4 ЗАДАНИЕ****\n")
    val listOfStroke = listOf(
        "Первая строка", "Вторая строка", "Третья строка", "Четвертая строка",
        "Пятьсот двадцать вторая строка", "строка"
    )
    println(listOfStroke.maxByOrNull { it.length })
    /**
     * 5 Задание. Написать класс Product с полями название и количество в конструкторе. Создать список продуктов,
     * состоящий из нескольких объектов класса. Посчитать общее количество продуктов, имеющихся на складе (в списке).
     * Целесообразно использовать функции map(), fold().
     */
    println("\n***5 ЗАДАНИЕ****\n")
    val listOfProducts = listOf(
        Product("Хлеб", 2),
        Product("Вода", 1),
        Product("Сок", 3),
        Product("Йогурт", 10),
        Product("Макароны", 2)
    )
    println(listOfProducts.sumOf { it.count })
    println(listOfProducts.map { it.count }.fold(0) { sum, element -> sum + element })
}

class Product(val name: String, val count: Int)