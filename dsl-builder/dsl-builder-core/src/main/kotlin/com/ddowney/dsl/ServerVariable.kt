package com.ddowney.dsl

fun createServerVariable(block: ServerVariable.() -> Unit): ServerVariable = ServerVariable()(block)

class ServerVariable {

    private val enumerations: MutableList<String> = mutableListOf()
    private var default: String? = null
    private var description: String? = null

    operator fun invoke(block: ServerVariable.() -> Unit): ServerVariable = this.also(block)

    fun enumerations(block: Enumerations.() -> Unit) {
        this.enumerations.addAll(Enumerations()(block))
    }

    fun default(block: () -> String) {
        this.default = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

}

class Enumerations : ArrayList<String>() {

    operator fun invoke(block: Enumerations.() -> Unit): Enumerations = this.also(block)

    fun enumeration(block: () -> String) {
        add(block())
    }

}