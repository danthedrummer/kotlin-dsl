package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Tag() {

    constructor(block: Tag.() -> Unit) : this() {
        apply(block)
    }

    var name: String? = null
    var description: String? = null
    var externalDocs: ExternalDocs? = null

    fun name(block: () -> String) {
        this.name = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }


    fun externalDocs(block: ExternalDocs.() -> Unit) {
        this.externalDocs = ExternalDocs(block)
    }

}