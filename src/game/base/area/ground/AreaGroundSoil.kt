package game.base.area.ground

import game.base.plant.BasePlant

abstract class AreaGroundSoil : AreaGround() {
    protected val plants: MutableList<BasePlant> = mutableListOf()

    fun addPlant(plant: BasePlant) {
        plants.add(plant)
    }
}