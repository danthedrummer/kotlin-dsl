package ddowney.dsl.openapi

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Example() {

    constructor(block: Example.() -> Unit) : this() {
        apply(block)
    }

    var summary: String? = null
    var description: String? = null
    var value: @Contextual Any? = null
    var externalValue: String? = null

    fun summary(block: () -> String) {
        this.summary = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun value(block: () -> Any) {
        this.value = block()
    }

    fun externalValue(block: () -> String) {
        this.externalValue = block()
    }
}