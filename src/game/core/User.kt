package game.core

import game.base.area.ground.AreaGroundSoil
import world.init.InitPlant

object User {
    fun onClickPlant(soil: AreaGroundSoil) {
        val plantQi1 = InitPlant.flowerQi()
        soil.addPlant(plantQi1)

        val plantQi2 = InitPlant.flowerQi()
        soil.addPlant(plantQi2)
    }
}