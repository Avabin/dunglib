import org.junit.Test
import tk.avabin.dunglib.api.dices.DiceCalculator

class DiceCalculatorTest {

    @Test
    fun simpleStatementTest() {
        assert(DiceCalculator.calculateFromStatement("10") == 10)
        assert(DiceCalculator.calculateFromStatement("1k12") in 1..12)
        assert(DiceCalculator.calculateFromStatement("1k12 + 1") in 2..13)
        assert(DiceCalculator.calculateFromStatement("10 + 2") == 12)
        assert(DiceCalculator.calculateFromStatement("10k10") in 10..100)
    }

    @Test
    fun complexStatementTest() {
        assert(DiceCalculator.calculateFromStatement("10 - 2 + 1") == 9)
        assert(DiceCalculator.calculateFromStatement("2k12 + 1k6 - 2") in 1..28)
        assert(DiceCalculator.calculateFromStatement("2 - 1 + 1k3 - 5") in 1..1)
    }
}