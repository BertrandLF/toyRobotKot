package com.octo.toyrobot

import java.util.logging.Logger

class World constructor(private val table: Table = Table()){

    private var robot: Robot? = null

    private val logger = Logger.getLogger(World::class.java.name)

    fun report(): String? { return this.robot?.report() }

    fun place(facing: Direction, position: Position) {
        logger.info("placing robot $facing, $position")
        this.robot = Robot(facing, position)
    }

    fun right() {
        logger.info("turning right")
        this.robot = this.robot?.right()
    }

    fun left() {
        logger.info("turning left")
        this.robot = this.robot?.left()
    }

    fun moveRobot() {
        this.robot = this.robot?.move(table)
    }

}
