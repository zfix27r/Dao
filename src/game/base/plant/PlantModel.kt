package game.base.plant

import game.evolution.EvolutionModel
import game.identity.IdentityModel

data class PlantModel(
    val id: Long,
    val identity: IdentityModel,
    val evo: EvolutionModel,
)