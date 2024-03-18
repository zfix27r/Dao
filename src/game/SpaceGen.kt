package game

import local.body.BodyEntity
import local.space.SpaceAreaEntity
import space.Space

class SpaceGen {
    fun generate(model: SpaceGenModel): Space {
        val space = Space()
        space.fill(getAreaEntity(model))

        return space
    }

    private fun getAreaEntity(model: SpaceGenModel): SpaceAreaEntity {

        return SpaceAreaEntity(
            id = 1,
            volume = 10,
            yin = 0,
            yang = 0,
            light = 0,
            dark = 0,
            water = 0,
            fire = 0,
            earth = 0,
            air = 0,
            metal = 0,
            wood = 0,
        )
    }

    private fun getTimeEntity(baseHP: Long): BodyEntity {
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