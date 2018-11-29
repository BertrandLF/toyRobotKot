package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import org.junit.Assert.assertEquals

object WorldSpec : Spek({

    given("a world with a table") {
        val size = 5
        val world = World(Table(size))
        it("should place a robot on the table") {
            world.place(Direction.NORTH, Position())
            assertEquals("0,0,NORTH", world.report())
        }

        it("should move the robot") {
            world.moveRobot()
            assertEquals("0,1,NORTH", world.report())
        }

        on("PLACE") {
            world.place(Position(2,4))
            it("should place an object at the given coordinates") {
                assertEquals(world.field()[2][4], 1)
            }
        }

    }

})
