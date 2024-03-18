import java.util.*

class Launcher {
    private val scanner = Scanner(System.`in`)
    private var game: Game? = null

    fun run() {
        while (true) {
            begin()
            action()
        }
    }

    private fun begin() {
        if (game != null) return
        game = Game()

        game?.let {
            it.begin()

/*

            it.god
            var genDaoBaseGenius: GenDaoBaseGenius? = null
            if (scanner.hasNext()) {
                var daoBaseChoice: DaoBase = DaoBase.ENERGY
                when (scanner.nextInt()) {
                    2 -> daoBaseChoice = DaoBase.BODY
                    3 -> daoBaseChoice = DaoBase.SPIRIT
                }
                genDaoBaseGenius = GenDaoBaseGenius(daoBaseChoice)
                println((genDaoBaseGenius.getEnergyGenius() + " " + genDaoBaseGenius.getBodyGenius()).toString() + " " + genDaoBaseGenius.getSpiritGenius())
            }
            if (genDaoBaseGenius == null) throw RuntimeException("гениальность не создана")
*/


        }
    }


    private fun action() {
        if (scanner.hasNext()) {
            when (scanner.nextInt()) {
                Action.BEGIN.ordinal -> begin()
            }
        }
    }

    /*   fun start() {


           println(INTRO_3)
           // колапс сознания и сотворение внутреннего мира
           val starPower: Int =
               genDaoBaseGenius.getEnergyGenius() + genDaoBaseGenius.getBodyGenius() + genDaoBaseGenius.getSpiritGenius()
           println("Вы открываете глаза и видите перед собой огонек. Он мерцает изивается, вы чувствуете его движения как свои собственные. Между вами определенно связь...")
           // ПАСХАЛКА. Цвет огонька указывает на уровень гениальности
           // энергия - это белый - свет
           // тело - это ярко красный - драконы
           // дух - это светло голубой - океан
           println("АЛЕРТ. Вы получаете первые знания. Медитация. Внутреннее зрение.")
           println("Вы чувствуете непреодолимое желание помедитировать рядом с этим огоньком. 1 - да. 2 - нет.")
           if (scanner.hasNext()) {
               when (scanner.nextInt()) {
                   1 -> {
                       val meditation = Meditation()
                       user.start(meditation)
                   }

                   2 -> println("Вы снова теряете сознание.")
               }
               genDaoBaseGenius = GenDaoBaseGenius(daoBaseChoice)
               println((genDaoBaseGenius.getEnergyGenius() + " " + genDaoBaseGenius.getBodyGenius()).toString() + " " + genDaoBaseGenius.getSpiritGenius())
           }

           // Этап 2. Осознание всего
           user.setName("Fix")
           //


           *//*        loading();

        System.out.println("Начало жизни");
        era = new Era(1);
        hero.setPlace(Place.TRAINING);

        era.info();
        while (era.step()) {
            if (queue.isInQueue(hero)) {
                queue.turn();
                era.info();

                continue;
            }

            System.out.println("Выберете действие: ");
            if (scanner.hasNext()) {
                switch (scanner.nextInt()) {
                    case 1 -> hero.info();
                    case 2 -> {
*//*
        *//*                        System.out.println("Укажите длительность медитации");
                        if (scanner.hasNext()) {
                        }*//*
        *//*
                        Meditation meditation = new Meditation();
                        meditation.setAgeLeft(1);
                        queue.add(hero, meditation);

                    }
                }
            }
//            Thread.sleep(500);
        }*//*
    }*/


}