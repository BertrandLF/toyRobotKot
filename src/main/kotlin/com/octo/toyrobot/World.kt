package com.octo.toyrobot

class World constructor(private val table: Table = Table()){

    private var robot: Robot? = null

    fun getRobot(): Robot? { return this.robot }

    fun place(facing: Direction, position: Position) {
        this.robot = Robot(facing, position)
    }

    fun moveRobot() {
        this.robot = this.robot?.move(table.height, table.width)
    }

}
