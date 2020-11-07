package ddowney.dsl.openapi

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class MediaType() {

    constructor(block: MediaType.() -> Unit) : this() {
        apply(block)
    }

    var schema: @Contextual Any? = null //TODO: Implement schema
    var examples: Map<String, Example>? = null
    var encodings: Map<String, Encoding>? = null

    fun schema(block: Any.() -> Unit) {
        this.schema = Any() //TODO: Implement schema
    }

    fun examples(block: Examples.() -> Unit) {
        this.examples = Examples(block).examples
    }

    fun encodings(block: Encodings.() -> Unit) {
        this.encodings = Encodings(block).encodings
    }

}