package entity.body

import entity.utils.Vitality

class EntityBodyBrain(
    override var max: Long,
    override var now: Long
) : Vitality {
    fun printSelf() {
        println("\t\tbrain")
        println("\t\tmaxHP: $max")
        println("\t\tnowHP: $now")
    }
}