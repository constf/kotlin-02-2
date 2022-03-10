package ru.netology.kotlin022

const val LUD = "людям"
const val CHEL = "человеку"

fun main() {
    var likes: Int = 0

    while (true) {
        print("Ведите количество лайков, челое число больше 0: ")
        val userInput = readLine()

        try {
            likes = userInput?.toInt()!!
        } catch (e: Exception) {
            println("Прошу ввести целое число больше нуля")
            continue
        }

        if (likes <= 0) {
            println("Прошу ввести целое число больше нуля")
            continue
        }

        break
    }

    val wordOut =
        if ((likes > 1) && (likes < 21))
            LUD
        else {
            if (likes % 10 == 1) CHEL
            else LUD
        }

    println("Понравилось $likes $wordOut")
}