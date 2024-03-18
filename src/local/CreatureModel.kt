package local

import local.body.BodyEntity
import local.identity.IdentityEntity

data class CreatureModel(
    val identityEntity: IdentityEntity,
    val bodyEntity: BodyEntity,
)