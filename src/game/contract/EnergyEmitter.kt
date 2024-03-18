package game.contract

import game.base.energy.Energy

interface EnergyEmitter : EnergyContract {
    fun emitEnergy(energy: Energy)
}