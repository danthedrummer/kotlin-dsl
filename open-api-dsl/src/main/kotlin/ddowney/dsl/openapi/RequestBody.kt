package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class RequestBody() {

    constructor(block: RequestBody.() -> Unit) : this() {
        apply(block)
    }

    var description: String? = null
    var content: MutableMap<String, MediaType>? = null
    var required: Boolean? = null

    fun description(block: () -> String) {
        this.description = block()
    }

    fun content(block: MediaTypes.() -> Unit) {
        this.content = MediaTypes(block).mediaTypes
    }

    fun required(block: () -> Boolean) {
        this.required = block()
    }
}