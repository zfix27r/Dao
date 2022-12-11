package creature

import common.Mutable
import creature.dao.DaoBody
import creature.dao.DaoEnergy
import creature.dao.DaoSpirit
import entity.CreatureEntity
import java.util.*

class Dao(creatureEntity: CreatureEntity) : Mutable {
    private val random = Random()

    private var _energy: DaoEnergy? = null
    val energy = _energy
    private var _body: DaoBody? = null
    val body = _body
    private var _spirit: DaoSpirit? = null
    val spirit = _spirit

    init {
        if (creatureEntity.dao.energy != null) _energy = DaoEnergy()
        if (creatureEntity.dao.body != null) _body = DaoBody()
        if (creatureEntity.dao.spirit != null) _spirit = DaoSpirit()
    }

    fun find(): Boolean {
        return random.nextInt(0, 100) > 50
    }

    override fun step() {
        TODO("Not yet implemented")
    }
}