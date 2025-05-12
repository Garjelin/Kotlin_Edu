package org.example.com.bignerdranch.nyethack

val player = Player("Estragon")

fun main() {
//    changeNarrationMood()
    val mortality = if (player.isImmortal) "an immortal" else "a mortal"
    narrate("${player.name}, ${player.title}, heads to the town square")
    visitTavern()
    player.castFireball()
}

private fun makeYellow(message: String): String = "\u001b[33;1m$message\u001b[0m"

private fun promptHeroName(): String {
    narrate("A hero enters the town of Kronstadt. What is their name?", ::makeYellow)
//    val input = readLine()
//    require(heroName != null && heroName.isNotEmpty()) {
//        "The hero must have a name."
//    }
//    return input
    println("Madrigal")
    return "Madrigal"
}