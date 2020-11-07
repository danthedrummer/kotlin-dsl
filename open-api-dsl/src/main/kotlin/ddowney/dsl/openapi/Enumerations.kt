package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Enumerations() {

    constructor(block: Enumerations.() -> Unit) : this() {
        block()
    }

    internal val enumerations = mutableListOf<String>()

    fun enumeration(block: () -> String) {
        enumerations.add(block())
    }

}