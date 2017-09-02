package tk.avabin.dunglib.server

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import tk.avabin.dunglib.server.beans.services.DiceService

@RunWith(SpringRunner::class)
@SpringBootTest
class ServerApplicationTests {

    @Autowired
    lateinit var diceService: DiceService

    @Test
    fun testDiceService() {
        var statement = "1d6"
        assert(diceService.roll(statement) in 1..6)

        statement = "2d20"
        assert(diceService.roll(statement) in 2..40)

        statement = "1k12 + 1"
        assert(diceService.roll(statement) in 2..13)

        statement = "1d6 + 1k12 + 2"
        assert(diceService.roll(statement) in 4..20)
    }

}
