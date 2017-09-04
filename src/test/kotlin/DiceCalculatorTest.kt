import org.junit.Test
import tk.avabin.dunglib.api.dices.DiceCalculator

class DiceCalculatorTest {

    @Test
    fun simpleStatementTest() {
        assert(DiceCalculator.calculateFromStatement("1k12") in 1..12)
        assert(DiceCalculator.calculateFromStatement("1k12 + 1") in 2..13)
    }

    @Test
    fun complexStatementTest() {
        assert(DiceCalculator.calculateFromStatement("2k12 + 1k6 - 2") in 1..28)
        assert(DiceCalculator.calculateFromStatement("10k2 + 2 - 1 + 1k3 - 5") in 7..19)
    }
}