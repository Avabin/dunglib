package tk.avabin.dunglib.server.beans.services

/**
 * @author Avabin
 */
interface DiceService {

    private fun parseStatement(statement: String) {

    }

    fun roll(statement: String): Int
}