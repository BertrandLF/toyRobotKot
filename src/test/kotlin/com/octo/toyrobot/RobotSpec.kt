package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals


object RobotSpec : Spek({

    given("a robot facing a particular direction") {
        val robots: List<Robot> = Direction.values().map { Robot(it) }

        on("move") {
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.NORTH, 0, 1),
                    Robot(Direction.EAST, 1, 0),
                    Robot(Direction.SOUTH, 0, -1),
                    Robot(Direction.WEST, -1, 0))

            robots.mapIndexed { index, robot ->
                val newRobot = robot.move()

                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }

        on("RIGHT") {
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.EAST, 0, 0),
                    Robot(Direction.SOUTH, 0, 0),
                    Robot(Direction.WEST, 0, 0),
                    Robot(Direction.NORTH, 0, 0))
            robots.mapIndexed { index, robot ->
                val newRobot = robot.right()
                it("should return ${expectedRobots[index]}") {
                    println("$index, ${expectedRobots[index]}, $newRobot")
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }

        on("LEFT") {
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.WEST, 0, 0),
                    Robot(Direction.NORTH, 0, 0),
                    Robot(Direction.EAST, 0, 0),
                    Robot(Direction.SOUTH, 0, 0))
            robots.mapIndexed { index, robot ->
                val newRobot = robot.left()

                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }
    }

})
