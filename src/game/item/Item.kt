package game.item

abstract class Item  {
    abstract val model: ItemModel

    fun up(volume: Long) {
    }

    fun down(volume: Long) {
    }
}