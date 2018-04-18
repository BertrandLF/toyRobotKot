package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals


object RobotSpec : Spek({

    given("robots facing all possible directions") {
        val robots: List<Robot> = Direction.values().map { Robot(it) }

        on("move") {
            robots.map { robot ->
                println("robot / $robot")
                val newRobot = robot.move()
                it("should return a robot at the new position") {
                    println("after move / $newRobot")
                    assertEquals(Robot(Direction.NORTH, 0, 1), newRobot)
                }
            }
        }
    }

})
