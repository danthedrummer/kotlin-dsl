package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class SecurityRequirements() {

    constructor(block: SecurityRequirements.() -> Unit) : this() {
        apply(block)
    }

    var securityRequirements = mutableListOf<SecurityRequirement>()

    fun securityRequirement(block: SecurityRequirement.() -> Unit) {
        this.securityRequirements.add(SecurityRequirement(block))
    }

}