package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals

object WorldSpec : Spek({

    given("a world with a robot") {
        val robot = Robot(0,0,Direction.NORTH)
        val world = World(robot)

        it("should report the robot's position") {
             assertEquals("Robot(x=0, y=0, facing=NORTH)", world.report())
        }
    }
})
