package com.ddowney.dsl

@OpenApiDslMarker
class ServerVariables() {

    constructor(block: ServerVariables.() -> Unit) : this() {
        apply(block)
    }

    internal val serverVariables = mutableMapOf<String, ServerVariable>()

    fun variable(name: String, block: ServerVariable.() -> Unit) {
        serverVariables[name] = ServerVariable(block)
    }

}