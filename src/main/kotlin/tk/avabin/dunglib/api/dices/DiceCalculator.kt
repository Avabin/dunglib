package tk.avabin.dunglib.api.dices

import java.util.regex.Pattern

object DiceCalculator {
    private val argumentRegex = Pattern.compile("[-+]?\\s*\\w+").toRegex()

    fun calculateFromStatement(statement: String): Int {
        val minVal = 1
        var sum = 0

        val args = argumentRegex.findAll(statement)

        args.forEach { matchResult: MatchResult ->
            sum += DiceArgument(matchResult.value).execute()
        }

        println("#################################\n" +
                "###    STATEMENT:\n" +
                "###    $statement\n" +
                "###    SUM: $sum")

        return maxOf(minVal, sum)
    }
}