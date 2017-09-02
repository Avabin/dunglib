package tk.avabin.dunglib.api.dices

import java.util.*
import java.util.regex.Pattern

/**
 * @author Avabin
 */
class DiceProvider {
    private val argsRegex = Pattern.compile("[-+*/]?\\s*\\w+").toRegex()

    private fun parseStatement(statement: String) {
        val args = ArrayList<String>()
    }

    fun execute(statement: String): Int {
        var retval = 1
        parseStatement(statement)
        return 1
    }
}

