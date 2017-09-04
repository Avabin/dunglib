package tk.avabin.dunglib.api.dices

import java.util.regex.Pattern

object DiceCalculator {
    private val argumentRegex = Pattern.compile("[-+]?\\s*\\w+").toRegex()

    fun calculateFromStatement(statement: String): Int {
        val minVal = 1
        var sum = 0


        return maxOf(minVal, sum)
    }
}