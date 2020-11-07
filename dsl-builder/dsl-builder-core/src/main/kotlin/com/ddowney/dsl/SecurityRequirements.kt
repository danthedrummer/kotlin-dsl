package com.ddowney.dsl

@OpenApiDslMarker
class SecurityRequirements() {

    constructor(block: SecurityRequirements.() -> Unit) : this() {
        apply(block)
    }

    var securityRequirements = mutableListOf<SecurityRequirement>()

    fun securityRequirement(block: SecurityRequirement.() -> Unit) {
        this.securityRequirements.add(SecurityRequirement(block))
    }

}