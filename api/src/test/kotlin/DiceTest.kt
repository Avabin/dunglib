import org.junit.Before
import org.junit.Test
import tk.avabin.dunglib.api.dices.*

/**
 * @author Avabin
 */
class DiceTest {

    private lateinit var dices: ArrayList<Dice>

    @Before
    fun setUp() {
        dices = ArrayList()
        dices.add(d2Dice())
        dices.add(d3Dice())
        dices.add(d4Dice())
        dices.add(d6Dice())
        dices.add(d8Dice())
        dices.add(d10Dice())
        dices.add(d12Dice())
        dices.add(d20Dice())
        dices.add(d100Dice())
    }

    @Test
    fun k3DiceTest() {
        dices.forEach({ d ->
            val roll = d.roll()
            println("DICE: " + d.javaClass.name)
            println("ROLL: " + roll)
            println("ASSERTION: " + assert(roll in d.min..d.max))
        })
    }
}