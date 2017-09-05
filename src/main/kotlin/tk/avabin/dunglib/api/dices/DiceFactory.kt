package tk.avabin.dunglib.api.dices

import java.util.*
import java.util.regex.Pattern

/**
 * @author Avabin
 */
object DiceFactory {
    private val diceRegex = Pattern.compile("[kd]+[0-9]+").toRegex()

    fun translateToDice(diceArg: String): Dice {
        val diceName = diceRegex.find(diceArg) ?: throw NoDiceException()
        val maxValue: Int
        try {
            maxValue = Integer.parseInt(diceName.value.substring(1))
        } catch (e: NumberFormatException) {
            throw NoDiceException()
        }


        val dice = object : Dice {
            override val min: Int = 1
                get() = field
            override var max: Int = 0
                set(value) {
                    field = value
                }
            override val random: Random = Random(System.currentTimeMillis())

        }

        dice.max = maxValue

        return dice
    }
}