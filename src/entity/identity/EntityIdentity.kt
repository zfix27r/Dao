package entity.identity

/*
*  Персональная информация
* */
data class EntityIdentity(
    val name: String,
) {
    fun printSelf() {
        println("\tidentity")
        println("\tname: $name")
        println("\t---------------------")
    }
}