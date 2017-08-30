package tk.avabin.dunglib.api

/**
 * @author Avabin
 */
interface CharacterClass {
    var level: Int
    val name: String
    var progressions: ArrayList<ClassLevelProgression>

}