import org.junit.Test
import tk.avabin.dunglib.api.dices.*

/**
 * @author Avabin
 */
class DiceProviderTest {
    var diceProvider: DiceProvider = DiceProvider()

    @Test
    fun translateArgToDice() {
        assert(diceProvider.translateArgToDice("1k2") is d2Dice)
        assert(diceProvider.translateArgToDice("1k3") is d3Dice)
        assert(diceProvider.translateArgToDice("1k4") is d4Dice)
        assert(diceProvider.translateArgToDice("1k6") is d6Dice)
        assert(diceProvider.translateArgToDice("1k8") is d8Dice)
        assert(diceProvider.translateArgToDice("1k10") is d10Dice)
        assert(diceProvider.translateArgToDice("1k12") is d12Dice)
        assert(diceProvider.translateArgToDice("1k20") is d20Dice)
        assert(diceProvider.translateArgToDice("1k100") is d100Dice)
    }

    @Test
    fun execute() {
        var statement = "1d6 + 1 + 1k12 + 2k10"
        assert(diceProvider.execute(statement) in 1..6)

        statement = "2d20"
        assert(diceProvider.execute(statement) in 2..40)

        statement = "1k12 + 1"
        assert(diceProvider.execute(statement) in 2..13)

        statement = "1d6 + 1k12 + 2"
        assert(diceProvider.execute(statement) in 4..20)

        statement = "1d6 - 2"
        assert(diceProvider.execute(statement) in 1..4)

        statement = "1k12 + 2 - 2"
        assert(diceProvider.execute(statement) in 1..12)
    }

}