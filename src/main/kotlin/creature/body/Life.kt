package creature.body

import common.Mutable
import entity.CreatureEntity

class Life(creatureEntity: CreatureEntity) : Mutable {
    private var _current: Int = creatureEntity.body.life.current
    val current = _current

    private var _max: Int = creatureEntity.body.life.max
    val max = _max

    override fun step() {
        _current++
        if (_current == _max) return
    }
}