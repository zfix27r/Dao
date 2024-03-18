import game.base.area.ground.AreaGroundSoil
import game.core.System
import game.core.User
import game.key.AreaKey
import world.init.initSpace

fun main() {
    val spaceController = initSpace.controller()

    System.loop {
        if (System.counter == 1) {
            spaceController.find(AreaKey.GARDEN)?.let { area ->
                if (area is AreaGroundSoil)
                    User.onClickPlant(area)
            }
        }

        spaceController.tick()
    }
}







