package game.contract

import game.base.energy.Energy

interface EnergyReceiver : EnergyContract {
    fun tickEnergyReceiver(energy: Energy)
}