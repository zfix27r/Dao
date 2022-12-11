package creature.dao

import common.Mutable

class DaoBody : Mutable {
    // виды тел
    // гуманойд, животное, аморфное, уникальное
    private val brain = 0
    private val heart = 0
    private val skeleton = 0
    private val skin = 0
    private val muscles = 0
    private val meridians = 0

    private fun humanoid() {}

    override fun step() {
        TODO("Not yet implemented")
    }
}