package com.octo.toyrobot

data class Robot(private val x: Int,
                 private val y: Int,
                 private val facing: Direction) {

    fun move(): Robot = when (facing) {
        Direction.NORTH -> Robot(x, y + 1, facing)
        Direction.EAST -> Robot(x + 1, y, facing)
        Direction.WEST -> Robot(x, y, facing)
        Direction.SOUTH -> Robot(x + 1, y - 1, facing)
    }

}

