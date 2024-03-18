package game.base

abstract class Time {
    var day: Long = 1
        private set

    open fun tick() {

    }

    fun nextDay() {
        day++
    }

    override fun toString(): String {
        return "День $day"
    }
}