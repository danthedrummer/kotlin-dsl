package ddowney.dsl.openapi

@OpenApiDslMarker
class Enumerations() {

    constructor(block: Enumerations.() -> Unit) : this() {
        block()
    }

    internal val enumerations = mutableListOf<String>()

    fun enumeration(block: () -> String) {
        enumerations.add(block())
    }

}