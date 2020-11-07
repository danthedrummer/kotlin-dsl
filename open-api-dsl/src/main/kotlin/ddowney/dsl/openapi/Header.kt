package ddowney.dsl.openapi

@OpenApiDslMarker
class Header() {

    constructor(block: Header.() -> Unit) : this() {
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