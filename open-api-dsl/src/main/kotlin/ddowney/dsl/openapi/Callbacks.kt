package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Callbacks() {

    constructor(block: Callbacks.() -> Unit) : this() {
        apply(block)
    }

    var callbacks = mutableMapOf<String, Path>()

    fun callback(name: String, block: Path.() -> Unit) {
        this.callbacks[name] = Path(block)
    }

}