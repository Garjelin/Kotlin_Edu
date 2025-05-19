package org.example.com.bignerdranch.nyethack

lateinit var player: Player

fun main() {
    narrate("Welcome to NyetHack!")
    val playerName = promptHeroName()
    player = Player(playerName)
//    changeNarrationMood()
    Game.play()
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

object Game {
    private var currentRoom: Room = Tavern()
    init {
        narrate("Welcome, adventurer")
        val mortality = if (player.isImmortal) "an immortal" else "a mortal"
        narrate("${player.name}, $mortality, has ${player.healthPoints} health points")
    }

    fun play() {
        while (true) {
            narrate("${player.name} of ${player.hometown}, ${player.title}, is in ${currentRoom.description()}")
            currentRoom.enterRoom()
            print("> Enter your command: ")
            println("Last command: ${readLine()}")
        }
    }
}