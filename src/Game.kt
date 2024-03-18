class Game {
    //private val queue: QQueue = QQueue()
    //private var _god: CreatureModel? = null

    fun begin() {
        print(INTRO_1)

        // этап 1. Сотворение всего
        createGod()

/*        _god?.let {
            // проявление гениальности
            println(INTRO_2)

        }*/
    }

    private fun createGod() {
/*        val identity = CreatureModel.Identity(name = "Fix")

        val life = CreatureModel.Body.Life(current = 1, max = 10)
        val body = CreatureModel.Body(life)

        val daoEnergy = CreatureModel.Dao.Energy()
        val daoBody = CreatureModel.Dao.Body()
        val daoSpirit = CreatureModel.Dao.Spirit()

        val dao = CreatureModel.Dao(energy = daoEnergy, body = daoBody, spirit = daoSpirit)

        val entity = CreatureModel(identity = identity, body = body, dao = dao)

        _god = Creature(creatureEntity = entity)*/
    }

    private fun print(msg: String) {
        println(msg)
    }

    companion object {
        const val INTRO_1 = "Появилось существо.У него нет не имени, ни пути, ни своего места."
        const val INTRO_2 = "Возникают новые ощущения, на чем сосредоточиться?\n1. окружение\n2. свое тело\n3. иное"
        const val INTRO_3 =
            "Вы начинаете ощущать жжения внутри себя. Оно разжигается все сильнее и сильнее. Пока вы не теряете сознание..."
    }
}