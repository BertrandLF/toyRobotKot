package com.octo.toyrobot

class World constructor(private val table: Table = Table()){

    private var robot: Robot? = null

    fun getRobot(): Robot? { return this.robot }

    fun place(facing: Direction, x: Int, y: Int) {
        this.robot = Robot(facing, x, y)
    }

    fun moveRobot() {
        this.robot = this.robot?.move()
    }

    fun report(): String {
        return robot.toString()
    }
}
