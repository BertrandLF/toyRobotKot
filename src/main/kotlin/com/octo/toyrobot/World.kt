package com.octo.toyrobot

class World constructor(private val robot: Robot){

    fun report(): String {
        return robot.toString()
    }
}
