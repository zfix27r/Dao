package impl.area.ground

import game.base.area.AreaModel
import game.base.area.ground.AreaGroundSoil
import game.base.energy.Energy
import game.contract.DevContract
import game.contract.EnergyEmitter
import game.contract.EnergyReceiver
import game.key.AreaKey
import impl.energy.EnergyController

class Garden(
    override val model: AreaModel,
    override val key: AreaKey,
    override val energyController: EnergyController,
) : AreaGroundSoil(), EnergyReceiver {
    override fun tick() {
        super.tick()

        plants.forEach {
            if (it is EnergyEmitter) {
                //it.emitEnergy(it.energyController.)
            }

            it.showProgress(model)
        }
    }

    override fun tickEnergyReceiver(energy: Energy) {
        if (energy is EnergyEmitter) {
            energy.emitEnergy(energy)
        }
    }

    override fun toString() : String {
        return "${model.identity.title} [$energyController]"
    }
}