package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals


object RobotSpec : Spek({

    given("a robot") {
        val robot = Robot(0, 0, Direction.NORTH)

        on("move") {
            val newRobot = robot.move()

            it("should return a robot at the new position") {
                assertEquals(Robot(0, 1, Direction.NORTH), newRobot)
            }
        }
    }

})
