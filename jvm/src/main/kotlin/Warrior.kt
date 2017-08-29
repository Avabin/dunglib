class Warrior(name: String, progressions: ArrayList<ClassLevelProgression>, level: Int) : CharacterClass {
    override val name = name
        get() = field
    override var progressions = progressions
        get() = field
        set(value) {field = value}
    override var level = level
        get() = field
        set(value) {field = value}

    fun levelUp(): Unit {
        this.level++
    }
}