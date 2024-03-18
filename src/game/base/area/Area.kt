package game.base.area

import game.base.Space

abstract class Area : Space() {
    abstract val model: AreaModel
    abstract val key: AreaKey

    protected val areas: MutableList<Area> = mutableListOf()

    fun addArea(area: Area) {
        areas.add(area)
    }

    override fun tick() {
        super.tick()

        areas.forEach { it.tick() }
    }
}