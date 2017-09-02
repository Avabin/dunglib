package tk.avabin.dunglib.api.dices

/**
 * @author Avabin
 */
class DiceArgument(val arg: String) {

    fun execute(): Int {
        val min = 1
        try {
            argDice = translateArgToDice(arg)
        }
    }

    fun translateArgToDice(arg: String): Dice {
        val diceArg = arg.replace("k", "d")
        return when (diceArg.substring(1)) {
            "d2" -> d2Dice()
            "d3" -> d3Dice()
            "d4" -> d4Dice()
            "d6" -> d6Dice()
            "d8" -> d8Dice()
            "d10" -> d10Dice()
            "d12" -> d12Dice()
            "d20" -> d20Dice()
            "d100" -> d100Dice()
            else -> throw NoDiceException()
        }
    }
}