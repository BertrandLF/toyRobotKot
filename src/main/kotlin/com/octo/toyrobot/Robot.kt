package com.octo.toyrobot

data class Robot(private val facing: Direction,
                 private val x: Int = 0,
                 private val y: Int = 0) {

    fun move(table: Table): Robot? {
        if (!movingIsSafe(table))
            return null

        return when (facing) {
            Direction.NORTH -> Robot(facing, x, y + 1)
            Direction.EAST -> Robot(facing, x + 1, y)
            Direction.WEST -> Robot(facing, x - 1, y)
            Direction.SOUTH -> Robot(facing, x, y - 1)
        }
    }

    fun right(): Robot = when (facing) {
        Direction.NORTH -> Robot(Direction.EAST, x, y)
        Direction.EAST -> Robot(Direction.SOUTH, x, y)
        Direction.SOUTH -> Robot(Direction.WEST, x, y)
        Direction.WEST -> Robot(Direction.NORTH, x, y)
    }

    fun left(): Robot = when (facing) {
        Direction.NORTH -> Robot(Direction.WEST, x, y)
        Direction.EAST -> Robot(Direction.NORTH, x, y)
        Direction.SOUTH -> Robot(Direction.EAST, x, y)
        Direction.WEST -> Robot(Direction.SOUTH, x, y)
    }

    private fun movingIsSafe(table: Table): Boolean {
        return true
    }
}

