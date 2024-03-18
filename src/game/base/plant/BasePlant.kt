package game.base.plant

import game.base.Space

abstract class BasePlant : Space() {
    protected abstract val plant: PlantModel

    fun isExpUnlimit() = plant.evo.exp == -1

    override fun tick() {
        super.tick()
        growUp()
    }

    private fun growUp() {
        with(plant) {
            evo.exp -= 2

            if (evo.exp < 1) {
                evo.lvl += 1
                evo.exp = game.core.Exp.getByLvl(evo.lvl)
                //material.hp = game.core.Hp.getByLvl(evo.lvl)
            }
        }
    }
}