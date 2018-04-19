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
            world.place(Direction.NORTH, 0, 0)
            assertEquals(robot, world.getRobot())
        }

        it("should move the robot") {
            world.moveRobot()
            assertEquals(Robot(Direction.NORTH, 0, 1), world.getRobot())
        }

        it("should report the robot's position") {
            assertEquals("Robot(facing=NORTH, x=0, y=1)", world.report())
        }
    }

})
