package impl.area.ground

import game.base.area.AreaKey
import game.base.area.AreaModel
import game.base.area.ground.AreaGroundSoil
import game.base.energy.Energy
import game.contract.EnergyEmitter
import game.contract.EnergyReceiver
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
        }
    }

    override fun tickEnergyReceiver(energy: Energy) {
        if (energy is EnergyEmitter) {
            energy.emitEnergy(energy)
        }
    }

    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("${model.identity.title} [$energyController]")

        plants.forEach {
            sb.append(it)
        }

        return sb.toString()
    }
}