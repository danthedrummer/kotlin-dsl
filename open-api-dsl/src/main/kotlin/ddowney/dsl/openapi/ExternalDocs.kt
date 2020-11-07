package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class ExternalDocs() {

    constructor(block: ExternalDocs.() -> Unit) : this() {
        apply(block)
    }

    var description: String? = null
    var url: String? = null

    fun description(block: () -> String) {
        this.description = block()
    }

    fun url(block: () -> String) {
        this.url = block()
    }

}