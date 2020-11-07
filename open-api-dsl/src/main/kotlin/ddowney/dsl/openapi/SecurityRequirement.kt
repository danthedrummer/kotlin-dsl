package ddowney.dsl.openapi

@OpenApiDslMarker
class SecurityRequirement() {

    constructor(block: SecurityRequirement.() -> Unit) : this() {
        apply(block)
    }

    var securityRequirements = mutableMapOf<String, List<String>>()

    fun securityRequirement(name: String, block: MutableList<String>.() -> Unit) {
        securityRequirements[name] = mutableListOf<String>().apply(block)
    }

}