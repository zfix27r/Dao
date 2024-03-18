package game.core

object Exp {
    val lvl1: Int = 10
    val lvl2: Int = 12
    val lvl3: Int = 16
    val lvl4: Int = 20
    val lvl5: Int = 28
    val lvl6: Int = 40
    val lvl7: Int = 54
    val lvl8: Int = 74
    val lvl9: Int = 100

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
            else -> -1
        }
}