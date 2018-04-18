package com.octo.toyrobot

data class Robot(private val facing: Direction,
                 private val x: Int = 0,
                 private val y: Int = 0) {

    fun move(): Robot = when (facing) {
        Direction.NORTH -> Robot(facing, x, y + 1)
        Direction.EAST -> Robot(facing, x + 1, y)
        Direction.WEST -> Robot(facing, x - 1, y)
        Direction.SOUTH -> Robot(facing, x, y - 1)
    }

}

