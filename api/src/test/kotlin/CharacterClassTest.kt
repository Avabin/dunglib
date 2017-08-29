import org.junit.After
import org.junit.Before
import org.junit.Test

/**
 * @author Avabin
 */
class CharacterClassTest {

    @Before
    fun setUp() {
        print("SetUpTest\n")

    }

    @Test
    fun warriorTest() {
        print("TestBody\n")
    }

    @After
    fun tearDown() {
        print("TearDownTest\n")
    }
}