package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Responses() {

    constructor(block: Responses.() -> Unit) : this() {
        apply(block)
    }

    var default: Response? = null
    var responses = mutableMapOf<String, Response>()

    fun default(block: Response.() -> Unit) {
        this.default = Response(block)
    }

    fun response(code: Int, block: Response.() -> Unit) {
        this.responses[code.toString()] = Response(block)
    }

}