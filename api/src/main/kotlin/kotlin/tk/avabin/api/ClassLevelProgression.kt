package tk.avabin.dunglib

/**
 * @author Avabin
 */
class ClassLevelProgression(
        val className: String,
        val level: Int,
        var action: (GameCharacter) -> Boolean)