package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Examples() {

    constructor(block: Examples.() -> Unit) : this() {
        apply(block)
    }

    var examples = mutableMapOf<String, Example>()

    fun example(name: String, block: Example.() -> Unit) {
        this.examples[name] = Example(block)
    }

}