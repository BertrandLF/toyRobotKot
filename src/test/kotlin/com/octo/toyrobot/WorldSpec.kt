package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals

object WorldSpec : Spek({

    given("a world with a table") {
        val world = World(Table())

        it("should place a robot on the table") {
            world.place(Direction.NORTH, Position())
            assertEquals("0,0,NORTH", world.report())
        }

        it("should move the robot") {
            world.moveRobot()
            assertEquals("0,1,NORTH", world.report())
        }

    }

})
