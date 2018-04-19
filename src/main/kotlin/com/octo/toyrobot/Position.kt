package com.octo.toyrobot

data class Position(private val x: Int=0, private val y: Int=0) {

    fun north() = Position(x, y + 1)
    fun east() = Position(x + 1, y)
    fun south() = Position(x, y - 1)
    fun west() = Position(x - 1, y)

    fun withinBoundaries(xMax: Int, yMax: Int): Boolean = x in 0..xMax && y in 0..yMax

    override fun toString() = "$x,$y"
}
