package game.base

import game.contract.DevContract

abstract class Space: Time(), DevContract {

    override fun showProgress(model: Any) {
        println(model)
    }
}