package com.skrebtsov.eugeney.roll

/**
 * Dice with a fixed number of sides.
 */
class Dice(private val numberSides: Int) {
    /**
     * Do a random dice roll and return the result.
     */
    fun roll(): Int {
        return (1..numberSides).random()
    }
}