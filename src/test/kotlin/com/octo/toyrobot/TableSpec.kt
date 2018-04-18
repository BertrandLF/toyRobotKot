package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals


object TableSpec : Spek({

    given("a table") {
        val table = Table()
        it("should have a height of 5") {
            assertEquals(5, table.height)
        }
        it("should have a width of 5") {
            assertEquals(5, table.width)
        }
    }

})