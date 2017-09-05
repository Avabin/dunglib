package tk.avabin.dunglib.api.dices

/**
 * @author Avabin
 */
class NoDiceException : Throwable() {
    override val message: String?
        get() = "No dice"
}