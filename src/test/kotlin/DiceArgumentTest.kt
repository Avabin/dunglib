import org.junit.Test
import tk.avabin.dunglib.api.dices.DiceArgument

class DiceArgumentTest {

    @Test
    fun argTestNormal() {
        val statement = "1k16"
        val diceArgument = DiceArgument(statement)
        assert(diceArgument.dice != null)
        assert(diceArgument.numArg == null)
    }

    @Test
    fun argTestPosNumber() {
        val statement = "10"
        val diceArgument = DiceArgument(statement)
        assert(diceArgument.dice == null)
        assert(diceArgument.numArg != null && diceArgument.numArg == 10)
    }

    @Test
    fun argTestNegNumber() {
        val statement = "-2"
        val diceArgument = DiceArgument(statement)
        assert(diceArgument.dice == null)
        assert(diceArgument.numArg != null && diceArgument.numArg == -2)
    }
}