package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Encodings() {

    constructor(block: Encodings.() -> Unit) : this() {
        apply(block)
    }

    var encodings = mutableMapOf<String, Encoding>()

    fun encoding(name: String, block: Encoding.() -> Unit) {
        this.encodings[name] = Encoding(block)
    }

}