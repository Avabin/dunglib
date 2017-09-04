package tk.avabin.dunglib.api.dices

import java.util.regex.Pattern

/**
 * @author Avabin
 */
class DiceArgument(arg: String) {
    private val diceRegex = Pattern.compile("[kd]+[0-9]+").toRegex()
    var dice: Dice? = null
        get() = field
    var numArg: Int? = null
        get() = field

    init {
        val diceName: MatchResult? = diceRegex.find(arg)
        val dice: Dice?
        try {
            dice = DiceFactory.translateToDice(diceName!!.value)
            this.dice = dice
        } catch (e: Exception) {
            numArg = Integer.parseInt(arg)
        }
    }

    fun execute(): Int {
        if(dice != null) return dice!!.roll()
        return numArg!!
    }
}