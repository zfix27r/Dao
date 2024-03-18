/*
class Creature(creatureEntity: CreatureModel?) : Mutable {
    private var _identity: Identity? = null
    private var _body: Body? = null
    private var _ability: Ability? = null
    private var _dao: Dao? = null
    private var _core: Core? = null

    init {
*/
/*        _identity = Identity(creatureEntity)
        _body = Body(creatureEntity)
        _ability = Ability(creatureEntity)
        _dao = Dao(creatureEntity)
        _core = Core(creatureEntity)*//*

    }

    val identity = _identity
    val body = _body
    val ability = _ability
    val dao = _dao
    val core = _core

    override fun step() {
        _identity?.step()
        _body?.step()
        _dao?.step()
    }

    fun findDao() {
        //initDao(100, 20, 40, 20)
    }

*/
/*    fun start(abillity: Abillity) {
        abillity.start(this)
    }*//*

}*/
