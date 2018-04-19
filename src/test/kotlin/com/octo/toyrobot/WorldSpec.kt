package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals

object WorldSpec : Spek({

    val robot = Robot(Direction.NORTH)
    val table = Table()

    given("a world with a table") {
        val world = World(table)

        it("should place a robot on the table") {
            world.place(Direction.NORTH, Position())
            assertEquals(robot, world.getRobot())
        }

        it("should move the robot") {
            world.moveRobot()
            assertEquals(Robot(Direction.NORTH, Position(0, 1)), world.getRobot())
        }

    }

})
