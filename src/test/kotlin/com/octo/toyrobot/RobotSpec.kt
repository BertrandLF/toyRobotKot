package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals


object RobotSpec : Spek({

    given("a robot facing any possible direction") {

        on("move") {
            val table = Table()
            val initialPosition = Position(1, 1)
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.NORTH, Position(1, 2)),
                    Robot(Direction.EAST, Position(2, 1)),
                    Robot(Direction.SOUTH, Position(1, 0)),
                    Robot(Direction.WEST, Position(0, 1)))

            Direction.values().mapIndexed { index, facing ->
                val newRobot = Robot(facing, initialPosition).move(table.width, table.height)

                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }

        val robots: List<Robot> = Direction.values().map { Robot(it) }

        on("RIGHT") {
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.EAST),
                    Robot(Direction.SOUTH),
                    Robot(Direction.WEST),
                    Robot(Direction.NORTH))
            robots.mapIndexed { index, robot ->
                val newRobot = robot.right()
                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }

        on("LEFT") {
            val expectedRobots: List<Robot> = listOf(
                    Robot(Direction.WEST),
                    Robot(Direction.NORTH),
                    Robot(Direction.EAST),
                    Robot(Direction.SOUTH))
            robots.mapIndexed { index, robot ->
                val newRobot = robot.left()

                it("should return ${expectedRobots[index]}") {
                    assertEquals(expectedRobots[index], newRobot)
                }
            }
        }
    }

    given("a robot facing the chasm") {
        val robot = Robot(Direction.SOUTH)

        it("should not fall") {
            assertEquals(robot, robot.move(5, 5))
        }
        it("should report the robot's position") {
            assertEquals("0,0,SOUTH", robot.report())
        }
    }
})
