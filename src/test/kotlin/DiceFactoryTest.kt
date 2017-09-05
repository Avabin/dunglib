import org.junit.Test
import tk.avabin.dunglib.api.dices.Dice
import tk.avabin.dunglib.api.dices.DiceFactory

/**
 * @author Avabin
 */
class DiceFactoryTest {

    @Test
    fun diceFactoryTest() {
        var diceName = "1k6"
        var dice: Dice = DiceFactory.translateToDice(diceName)
        testDice(dice)
        assert(dice.max == 6)

        diceName = "1k100"
        dice = DiceFactory.translateToDice(diceName)
        testDice(dice)
        assert(dice.max == 100)
    }

    fun testDice(dice: Dice) {
        for (i in 1..100) assert(dice.roll() in 1..dice.max)
    }
}