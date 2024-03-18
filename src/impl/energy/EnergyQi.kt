package impl.energy

import game.base.energy.Energy
import game.base.energy.EnergyModel
import game.base.energy.EnergyKey


class EnergyQi(
    override val key: EnergyKey,
    override val model: EnergyModel,
): Energy() {

}