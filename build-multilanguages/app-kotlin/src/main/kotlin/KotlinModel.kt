class KotlinModel(
    private val scalaLogic: ScalaLogic
) {

    init {
        val res = scalaLogic.doSomething()
    }
}
