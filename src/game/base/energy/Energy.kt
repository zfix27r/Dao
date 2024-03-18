package game.base.energy

abstract class Energy  {
    abstract val key: EnergyKey
    abstract val model: EnergyModel

    fun up() {
        model.capacity += model.accrual
    }

    fun up(volume: Long) {
        model.capacity += volume
    }

    fun down(volume: Long) {
        model.capacity -= volume
    }
}