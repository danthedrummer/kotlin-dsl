package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class SecurityRequirement() {

    constructor(block: SecurityRequirement.() -> Unit) : this() {
        apply(block)
    }

    var securityRequirements = mutableMapOf<String, List<String>>()

    fun securityRequirement(name: String, block: MutableList<String>.() -> Unit) {
        securityRequirements[name] = mutableListOf<String>().apply(block)
    }

}