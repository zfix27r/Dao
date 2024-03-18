package local.body

data class BodyEntity(
    val id: Int,
    val maxHP: Long,
    val nowHP: Long,
    val brainMaxHP: Long,
    val brainNowHP: Long,
)