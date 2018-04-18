package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals

object WorldSpec : Spek({

    given("a world with a robot") {
        val robot = Robot(Direction.NORTH, 0, 0)
        val world = World(robot)

        it("should report the robot's position") {
             assertEquals("Robot(facing=NORTH, x=0, y=0)", world.report())
        }
    }
})
