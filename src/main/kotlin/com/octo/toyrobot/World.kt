package com.octo.toyrobot

class World constructor(private val table: Table = Table()){

    private var robot: Robot? = null

    fun report(): String? { return this.robot?.report() }

    fun place(facing: Direction, position: Position) {
        this.robot = Robot(facing, position)
    }

    fun moveRobot() {
        this.robot = this.robot?.move(table.height, table.width)
    }

}

fun main(args: Array<String>) {
    print("Main is ready!!!!!!!!!!!")
}
