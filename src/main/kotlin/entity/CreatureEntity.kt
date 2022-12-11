package entity

data class CreatureEntity(
    val identity: Identity,
    val body: Body,
    val dao: Dao
) {
    data class Identity(
        val name: String
    )

    data class Body(
        val life: Life
    ) {
        data class Life(
            val current: Int = 1,
            val max: Int = 10
        )
    }

    data class Dao(
        val energy: Energy?,
        val body: Body?,
        val spirit: Spirit?
    ) {
        data class Energy(
            val id: Long = 1
        )

        data class Body(
            val id: Long = 1
        )

        data class Spirit(
            val id: Long = 1
        )
    }
}
