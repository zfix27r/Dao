package entity.body

import entity.utils.Vitality

/*
* Состояние физического тела
* */
class EntityBody(
    override var max: Long,
    override var now: Long
) : Vitality {
    // виды тел
    // гуманойд, животное, аморфное, уникальное
    var brain: EntityBodyBrain? = null
    private val heart = 0
    private val skeleton = 0
    private val skin = 0
    private val muscles = 0
    private val meridians = 0

    private fun humanoid() {}

    fun printSelf() {
        println("\tbody")
        println("\tmaxHP: $max")
        println("\tnowHP: $now")
        brain?.printSelf()
        println("\t---------------------")
    }
}