package com.octo.toyrobot

import java.io.File
import java.util.logging.Logger


fun main(args: Array<String>) = if (args.size == 1) {

    val logger = Logger.getLogger(Robot::class.java.name)
    val world = World()
    File(args[0]).bufferedReader().forEachLine { line ->
        val placeRegex = Regex("(PLACE) ([0-9]),([0-9]),(NORTH|EAST|SOUTH|WEST)")

        when (line) {
            in placeRegex -> {
                placeRegex.matchEntire(line)?.destructured?.let { (_, x, y, facing) ->
                    world.place(Direction.valueOf(facing), Position(x.toInt(), y.toInt()))
                }
            }
            "MOVE" -> world.moveRobot()
            "RIGHT" -> world.right()
            "LEFT" -> world.left()
            "REPORT" -> print(world.report())
            else -> logger.info("ignoring $line")
        }
    }
} else {
    print("Wrong number of arguments, expected 1 (fileName) got ${args.size}")
}


operator fun Regex.contains(text: CharSequence): Boolean = this.matches(text)
