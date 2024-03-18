package game.core

object Hp {
    val lvl1 = 18L
    val lvl2 = 20L
    val lvl3 = 22L
    val lvl4 = 26L
    val lvl5 = 32L
    val lvl6 = 42L
    val lvl7 = 54L
    val lvl8 = 68L
    val lvl9 = 90L

    fun getByLvl(lvl: Int) =
        when (lvl) {
            1 -> lvl1
            2 -> lvl2
            3 -> lvl3
            4 -> lvl4
            5 -> lvl5
            6 -> lvl6
            7 -> lvl7
            8 -> lvl8
            9 -> lvl9
            else -> 0L
        }
}