package ddowney.dsl.openapi

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class AnyMapReceiver() {

    constructor(block: AnyMapReceiver.() -> Unit) : this() {
        apply(block)
    }

    var map = mutableMapOf<String, @Contextual Any>()

    fun entry(name: String, block: () -> Any) {
        this.map[name] = block()
    }

}