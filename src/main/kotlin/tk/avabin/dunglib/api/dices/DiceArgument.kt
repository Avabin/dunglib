package tk.avabin.dunglib.api.dices

import java.util.regex.Pattern

/**
 * @author Avabin
 */
class DiceArgument(arg: String) {
    private val diceRegex = Pattern.compile("[kd]+[0-9]+").toRegex()
    var dice: Dice? = null
    var numArg: Int? = null

    fun getArgument() {

    }

    init {
        val diceName = diceRegex.find(arg)!!.value
        val dice: Dice?
        try {
            dice = DiceFactory.translateToDice(diceName)
            this.dice = dice
        } catch (e: NoDiceException) {
            try {

            }
        }
    }
}