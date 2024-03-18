package world.init

import game.core.Exp
import game.core.Hp
import game.core.Layer
import game.base.energy.EnergyModel
import game.base.plant.PlantModel
import game.evolution.EvolutionModel
import game.identity.IdentityModel
import game.base.energy.EnergyKey
import impl.energy.EnergyController
import impl.energy.EnergyLife
import impl.energy.EnergyQi
import impl.plant.flower.PlantFlowerQi

object InitPlant {
    fun flowerQi() : PlantFlowerQi {
        val level = 1

        val identity = IdentityModel(
            title = "Цветок Ци"
        )

        val evo = EvolutionModel(
            layer = Layer.MORTAL,
            lvl = level,
            exp = Exp.getByLvl(level)
        )

        val plantModel = PlantModel(
            id = 1,
            identity = identity,
            evo = evo,
        )

        val flowerQi = PlantFlowerQi(plantModel, getEnergy())

        return flowerQi
    }

    fun getEnergy() : EnergyController {
        val controller = EnergyController()

        val energyQiModel = EnergyModel(
            capacity = 0L,
            emit = 1L,
            accrual = 1L,
        )
        controller.add(EnergyQi(EnergyKey.QI, energyQiModel))

        val energyLifeModel = EnergyModel(
            capacity = Hp.getByLvl(1),
            emit = 0L,
            accrual = 0L,
        )
        controller.add(EnergyLife(EnergyKey.LIFE, energyLifeModel))

        return controller
    }
}