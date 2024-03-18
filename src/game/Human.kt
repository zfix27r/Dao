package game


import entity.Entity
import local.body.BodyEntity
import local.CreatureModel
import local.identity.IdentityEntity

class Human {
    fun generate(name: String, baseHP: Long): Entity {
        val creatureModel = CreatureModel(
            identityEntity = getIdentityEntity(name),
            bodyEntity = getBodyEntity(baseHP)
        )

        val creature = Entity()
        creature.fill(creatureModel)

        return creature
    }

    private fun getIdentityEntity(name: String): IdentityEntity {
        return IdentityEntity(
            id = 1,
            name = name
        )
    }

    private fun getBodyEntity(baseHP: Long): BodyEntity {
        val maxHP = baseHP
        val nowHP = baseHP
        val brainMaxHP = (maxHP * 0.3).toLong()
        val brainNowHP = (maxHP * 0.3).toLong()

        return BodyEntity(
            id = 1,
            maxHP = maxHP,
            nowHP = nowHP,
            brainMaxHP = brainMaxHP,
            brainNowHP = brainNowHP
        )
    }
}