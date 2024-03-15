
enum class DayOfWeekEnum {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
enum class ColorEnum {
    RED,
    GREEN,
    BLUE,
    YELLOW,
    MAGENTA,
    PURPLE
}
fun getDayOfWeekAsString(day: DayOfWeekEnum): String {
    return day.name
}

fun getDayOfWeekAsNumber(day: DayOfWeekEnum): Int {
    return day.ordinal + 1
}

fun getColorAsString(color: ColorEnum): String {
    return color.name
}

fun getColorAsNumber(color: ColorEnum): Int {
    return color.ordinal + 1
}
fun main(){
    println("Введите день недели (MONDAY, TUESDAY, и т.д.): ")
    val inputDay = readln().toString()

    println("Введите цвет (RED, GREEN, и т.д.): ")
    val inputColor = readln().toString()

    try {
        val day = DayOfWeekEnum.valueOf(inputDay)
        val color = ColorEnum.valueOf(inputColor)

        println("День недели: ${getDayOfWeekAsString(day)} (${getDayOfWeekAsNumber(day)})")
        println("Цвет: ${getColorAsString(color)} (${getColorAsNumber(color)})")
    } catch (e: IllegalArgumentException) {
        println("Некорректный ввод. Пожалуйста, введите корректное значение.")
    }
}