package world.init

import game.base.area.AreaKey
import game.base.area.AreaModel
import game.base.energy.EnergyKey
import game.base.energy.EnergyModel
import game.identity.IdentityModel
import impl.SpaceController
import impl.area.ground.Garden
import impl.energy.EnergyController
import impl.energy.EnergyQi

object InitSpace {
    fun controller(): SpaceController {
        val controller = SpaceController()
        controller.addArea(garden())

        return controller
    }

    private fun garden(): Garden {
        val identity = IdentityModel(
            title = "Сад"
        )
        val seed = AreaModel(
            identity = identity,
            space = 16
        )

        val key = AreaKey.GARDEN

        val garden = Garden(seed, key, gardenEnergyController())

        return garden
    }

    private fun gardenEnergyController(): EnergyController {
        val controller = EnergyController()

        val energyModel = EnergyModel(
            capacity = 0L,
            emit = 1L,
            accrual = 1L,
        )
        val qi = EnergyQi(EnergyKey.QI, energyModel)
        controller.add(qi)

        return controller
    }
}