package tk.avabin.dunglib.api.dices

/**
 * Class representing dice argument in statement used within DiceCalculator.
 * @author: Avabin
 * @constructor string argument. Example arguments
 *              k6      -> random from 1 to 6
 *              1d12    -> random from 1 to 12
 *              2k6     -> random from 2 to 12
 */
class DiceArgument(arg: String) {
    private val diceRegex = Regex("[kd]+[0-9]+")
    private var numOfRolls = 1
    private var sign = "+"
    var dice: Dice? = null
        get() = field
    var numArg: Int? = null
        get() = field

    init {
        val diceName: MatchResult? = diceRegex.find(arg)
        val dice: Dice?
        try {
            dice = DiceFactory.translateToDice(diceName!!.value)
            numOfRolls = Integer.parseInt(arg.replace(diceName.value, "").replace(" ", ""))
            sign = arg.replace(numOfRolls.toString(), "")
            this.dice = dice
        } catch (e: Exception) {
            numArg = Integer.parseInt(arg.replace(" ", ""))
        }
    }

    /**
     * Execute method
     * @return dice roll or integer from argument
     */
    fun execute(): Int {
        if (dice != null) {
            var sum = 0
            for (x in 1..numOfRolls) sum += dice!!.roll()
            if (sign == "-") sum = 0 - sum
            return sum
        }
        return numArg!!
    }
}