package impl

import game.base.Space
import game.base.area.Area
import game.base.area.AreaKey

class SpaceController : Space() {
    private val areas: MutableMap<AreaKey, Area> = mutableMapOf()

    override fun tick() {
        areas.values.forEach {
            it.tick()
        }
    }

    fun addArea(area: Area) {
        findKey(area)?.let { key ->
            areas[key] = area
        }
    }

    fun find(key: AreaKey) = areas[key]

    private fun findKey(area: Area) =
        when (area) {
            else -> null
        }
}