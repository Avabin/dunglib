package tk.avabin.dunglib.api.dices

object DiceCalculator {
    private val argumentRegex = Regex("[-+]?\\s*\\w+")
    private val argumentDropRegex = Regex("[-+]?[0-9]+[dk][0-9]+\\s+dM..")

    fun calculateFromStatement(s: String): Int {
        var statement: String = s
        val minVal = 1
        var sum = 0

        argumentDropRegex.findAll(statement).forEach { matchResult: MatchResult ->
            run {
                val arg = matchResult.value
                if (arg.contains("dMin")) {
                    statement = statement.replace(arg, "")
                    sum += DiceArgument(argumentRegex.find(arg)!!.value).execute(dropMin = true)
                }
                if (arg.contains("dMax")) {
                    statement = statement.replace(arg, "")
                    sum += DiceArgument(argumentRegex.find(arg)!!.value).execute(dropMax = true)
                }
            }
        }

        val args = argumentRegex.findAll(statement)

        args.forEach { matchResult: MatchResult -> sum += DiceArgument(matchResult.value).execute() }

        println("#################################\n" +
                "###    STATEMENT:\n" +
                "###    $s\n" +
                "###    SUM: $sum\n" +
                "###    RESULT: ${maxOf(minVal, sum)}")


        return maxOf(minVal, sum)
    }
}