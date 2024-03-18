package impl.energy

import game.base.energy.Energy
import game.base.energy.EnergyKey

class EnergyController {
    private val energies: MutableMap<EnergyKey, Energy> = mutableMapOf()

    fun add(energy: Energy) {
        findKey(energy)?.let { key ->
            energies.put(key, energy)
        }
    }

    fun find(key: EnergyKey) = energies[key]

    fun up(key: EnergyKey) {
        energies[key]?.up()
    }

    fun up(key: EnergyKey, volume: Long) {
        energies[key]?.up(volume)
    }

    private fun findKey(energy: Energy) =
        when (energy) {
            is EnergyQi -> EnergyKey.QI
            is EnergyLife -> EnergyKey.LIFE
            else -> null
        }

    override fun toString(): String {
        val sb = StringBuilder()
        energies.values.forEach { sb.append(it) }

        return sb.toString()
    }
}