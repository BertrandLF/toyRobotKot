package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.*


object TableSpec : Spek({

    given("a table") {
        val table = Table()
        it("should have a height of 4") {
            assertEquals(4, table.height)
        }

        it("should have a width of 5") {
            assertEquals(4, table.width)
        }

        it("should say this is a valid position") {
            val validPosition = Position(1,1)
            assertTrue(table.withinBoundaries(validPosition))
        }
        it("should say this is an invalid position") {
            val invalidPosition = Position(5,5)
            assertFalse(table.withinBoundaries(invalidPosition))
        }
    }


})
