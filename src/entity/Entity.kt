package entity

import entity.body.EntityBody
import entity.identity.EntityIdentity
import space.Space
import local.body.BodyEntity
import local.CreatureModel
import local.identity.IdentityEntity

class Entity {
    var identity: EntityIdentity? = null
        private set
    var body: EntityBody? = null
        private set
    var mind: Mind? = null
        private set
    var energy: Energy? = null
        private set
    var art: Art? = null
        private set
    var technic: Technic? = null
        private set
    var dao: Dao? = null
        private set
    var space: Space? = null
        private set

    fun fill(creatureModel: CreatureModel) {
        with(creatureModel) {
            fill(identityEntity)
            fill(bodyEntity)
        }
    }

    private fun fill(identityEntity: IdentityEntity) {
        this.identity = EntityIdentity(identityEntity.name)
    }

    private fun fill(bodyEntity: BodyEntity) {
        val body = EntityBody(
            max = bodyEntity.maxHP,
            now = bodyEntity.nowHP
        )

        /*    val brain = CreatureBodyBrain(
                max = bodyEntity.brainMaxHP,
                now = bodyEntity.brainNowHP
            )

            body.brain = brain*/

        this.body = body
    }

    fun printSelf() {
        println("/////////////////////")
        identity?.printSelf()
        body?.printSelf()
        println("energy: $energy")
        println("mind: $mind")
        println("art: $art")
        println("technic: $technic")
        println("dao: $dao")
        println("/////////////////////")
    }
}


sealed interface Mind

sealed interface Body

sealed interface Energy

sealed interface Art
sealed interface Technic
sealed interface Dao