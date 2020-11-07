package com.ddowney.dsl

@OpenApiDslMarker
class Examples() {

    constructor(block: Examples.() -> Unit) : this() {
        apply(block)
    }

    var examples = mutableMapOf<String, Example>()

    fun example(name: String, block: Example.() -> Unit) {
        this.examples[name] = Example(block)
    }

}