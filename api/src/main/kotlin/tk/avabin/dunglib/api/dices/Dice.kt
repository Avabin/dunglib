package tk.avabin.dunglib.api.dices

import java.util.*

/**
 * @author Avabin
 */
interface Dice {
    val random: Random
    val max: Int
    val min: Int

    fun roll(): Int {
        return min + (random.nextInt(max - min))
    }

}