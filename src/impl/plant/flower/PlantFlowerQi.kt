package impl.plant.flower

import game.base.energy.Energy
import game.base.plant.BasePlant
import game.base.plant.PlantModel
import game.contract.EnergyEmitter
import game.base.energy.EnergyKey
import impl.energy.EnergyController

class PlantFlowerQi(
    override val plant: PlantModel,
    override val energyController: EnergyController,
) : BasePlant(), EnergyEmitter {
    override fun tick() {
        super.tick()
        energyController.up(EnergyKey.QI)

        showProgress(this)
    }

    override fun emitEnergy(energy: Energy) {
        energyController.find(energy.key)?.model?.emit?.let {
            energy.up(it)
        }
    }

    override fun toString() : String {
        return "${plant.identity.title} [$energyController]"
    }
}