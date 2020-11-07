package ddowney.dsl.openapi

@OpenApiDslMarker
class Response() {

    constructor(block: Response.() -> Unit) : this() {
        apply(block)
    }

    var description: String? = null
    var headers: Map<String, Header>? = null
    var content: Map<String, MediaType>? = null
    var links: Map<String, Link>? = null

    fun description(block: () -> String) {
        this.description = block()
    }

    fun headers(block: Headers.() -> Unit) {
        this.headers = Headers(block).headers
    }

    fun content(block: MediaTypes.() -> Unit) {
        this.content = MediaTypes(block).mediaTypes
    }

    fun links(block: Links.() -> Unit) {
        this.links = Links(block).links
    }

}