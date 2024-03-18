package game.core

object System {
    var counter: Int = 0
        private set

    fun loop(snippet: () -> Unit) {
        while(true) {
            if (counter > 10) break

            snippet.invoke()

            counter++
        }
    }
}