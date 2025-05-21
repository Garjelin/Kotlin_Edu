package com.bignerdranch.nyethack

data class Coordinate(val x: Int, val y: Int)

enum class Direction(
    private val directionCoordinate: Coordinate
) {
    North(Coordinate(0, -1)),
    East(Coordinate(1, 0)),
    South(Coordinate(0, 1)),
    West(Coordinate(-1, 0))
}