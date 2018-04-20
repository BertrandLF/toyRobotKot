package com.octo.toyrobot

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.junit.Assert.assertEquals
import java.io.ByteArrayOutputStream
import java.io.PrintStream

object RobotE2ESpec : Spek({

    var record = ByteArrayOutputStream()

    beforeEachTest {
        record = ByteArrayOutputStream()
        val stream = PrintStream(record)
        System.setOut(stream)
    }

    given("an input file") {
        val fileLocation = "./src/test/resources/testRobot.txt"
        val args = arrayOf(fileLocation)

        it("should report the expected position") {
            main(args)
            assertEquals("4,2,EAST", record.toString())
        }

    }

    given("an input file putting the robot at risk") {
        val fileLocation = "./src/test/resources/testRobotNoFall.txt"
        val args = arrayOf(fileLocation)

        it("should report the expected position") {
            main(args)
            assertEquals("5,5,NORTH", record.toString())
        }

    }
})
