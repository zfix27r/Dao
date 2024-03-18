package impl.energy

import game.base.energy.Energy
import game.base.energy.EnergyModel
import game.key.EnergyKey

class EnergyLife(
    override val key: EnergyKey,
    override val model: EnergyModel,
): Energy() {

}