package tk.avabin.dunglib.api

/**
 * @author Avabin
 */
class ClassLevelProgression(
        val className: String,
        val level: Int,
        var action: (GameCharacter) -> Boolean)