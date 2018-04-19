package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals


object RobotSpec : Spek({

    given("robots facing all possible directions") {
        val robots: List<Robot> = Direction.values().map { Robot(it) }
        val expectedRobots: List<Robot> = listOf(
                Robot(Direction.NORTH, 0, 1),
                Robot(Direction.EAST, 1, 0),
                Robot(Direction.SOUTH, 0, -1),
                Robot(Direction.WEST, -1, 0))

        on("move") {
            robots.mapIndexed { index, robot ->
                val newRobot = robot.move()

                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }
    }

})
