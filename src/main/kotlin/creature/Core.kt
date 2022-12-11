package creature

import creature.core.Location
import creature.core.Darkness
import creature.core.Light
import creature.core.Yin
import entity.CreatureEntity

class Core(creatureEntity: CreatureEntity) {
    private var location: Location? = null
    private var yin: Yin? = Yin()
    private var darkness: Darkness? = Darkness()
    private var light: Light? = Light()
}