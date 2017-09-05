package tk.avabin.dunglib.api.dices

import java.util.*

/**
 * @author Avabin
 */
interface Dice {
    val min: Int
    val max: Int
    val random: Random

    fun roll(): Int {
        return min + (random.nextInt(max - min))
    }

}