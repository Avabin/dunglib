import org.junit.Test

/**
 * @author Avabin
 */

class CharacterClassTest {

    @Test
    fun warriorTest(): Unit {
        var classLevelProgressions = ArrayList<ClassLevelProgression>()
        val warrior = Warrior("Warrior", classLevelProgressions, 1)
        classLevelProgressions.add(ClassLevelProgression(warrior.name, 2))

        assert(warrior.name == "Warrior")
        assert(warrior.level == 1)
        assert(warrior.progressions[0].className == warrior.name)

        warrior.levelUp()

        assert(warrior.level == 2)

    }
}