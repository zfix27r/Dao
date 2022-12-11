package entity

data class EraEntity(
    val life: Life? = null,
    val dao: Dao? = null
) {
    data class Life(
        val id: Long = 1,
        val current: Int = 1,
        val max: Int = 10
    )

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
