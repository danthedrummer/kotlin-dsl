package ddowney.dsl.openapi

@OpenApiDslMarker
class Components() {

    constructor(block: Components.() -> Unit) : this() {
        apply(block)
    }

    var schemes: Map<String, Any>? = null // TODO: Implement schemes
    var responses: Map<String, Response>? = null
    var parameters: Map<String, Parameter>? = null
    var examples: Map<String, Example>? = null
    var requestBodies: Map<String, RequestBody>? = null
    var headers: Map<String, Header>? = null
    var securitySchemes: Map<String, Any>? = null // TODO: Implement security scheme
    var links: Map<String, Link>? = null
    var callbacks: Map<String, Path>? = null

    fun schemes(block: () -> Unit) {
        this.schemes = mutableMapOf() // TODO: Implement schemes
    }

    fun responses(block: Responses.() -> Unit) {
        this.responses = Responses(block).responses
    }

    fun parameters(block: Parameters.() -> Unit) {
        this.parameters = mapOf() // TODO: Fix this
//        this.parameters = Parameters(block).parameters
    }

    fun requestBodies(block: RequestBodies.() -> Unit) {
        this.requestBodies = RequestBodies(block).requestBodies
    }

    fun headers(block: Headers.() -> Unit) {
        this.headers = Headers(block).headers
    }

    fun securitySchemes(block: () -> Unit) {
        this.securitySchemes = null // TODO: Implement security schemes
    }

    fun links(block: Links.() -> Unit) {
        this.links = Links(block).links
    }

    fun callbacks(block: Callbacks.() -> Unit) {
        this.callbacks = Callbacks(block).callbacks
    }

}