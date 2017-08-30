package tk.avabin.dunglib.api.dices

import java.util.*

/**
 * @author Avabin
 */
class d20Dice : Dice {
    override val random: Random = Random()
        get() = field
    override val max: Int = 20
        get() = field
    override val min: Int = 1
        get() = field
}