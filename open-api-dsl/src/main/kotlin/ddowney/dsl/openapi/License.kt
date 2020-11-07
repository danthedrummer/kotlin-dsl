package ddowney.dsl.openapi

@OpenApiDslMarker
class License() {

    constructor(block: License.() -> Unit) : this() {
        apply(block)
    }

    private var name: String? = null
    private var url: String? = null

    fun name(block: () -> String) {
        this.name = block()
    }

    fun url(block: () -> String) {
        this.url = block()
    }

}