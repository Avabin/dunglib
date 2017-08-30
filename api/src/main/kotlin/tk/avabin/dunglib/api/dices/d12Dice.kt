package tk.avabin.dunglib.api.dices

import java.util.*

/**
 * @author Avabin
 */
class d12Dice : Dice {
    override val random: Random = Random()
        get() = field
    override val max: Int = 12
        get() = field
    override val min: Int = 1
        get() = field
}