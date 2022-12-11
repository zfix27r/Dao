package creature

import common.Mutable
import entity.CreatureEntity

class Identity(creatureEntity: CreatureEntity) : Mutable {
    val name = creatureEntity.identity.name

    override fun step() {
    }
}