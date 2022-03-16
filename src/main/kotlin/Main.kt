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
        } catch (e: NumberFormatException) {
            println("Прошу ввести целое ЧИСЛО больше нуля")
            continue
        }

        if (likes <= 0) {
            println("Прошу ввести целое число больше нуля")
            continue
        }

        break
    }

    val reducedLikes = likes % 100
    val wordOut =
        if ((reducedLikes > 1) && (reducedLikes % 10 != 1) || (reducedLikes == 11))
            LUD
        else
            CHEL


    println("Понравилось $likes $wordOut")
}