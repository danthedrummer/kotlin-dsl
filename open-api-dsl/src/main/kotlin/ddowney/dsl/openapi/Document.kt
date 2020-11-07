package ddowney.dsl.openapi

@OpenApiDslMarker
class Document() {

    constructor(block: Document.() -> Unit) : this() {
        block()
    }

    var openApi: String? = null
    var info: Info? = null
    var servers: List<Server>? = null
    var paths: Map<String, Path>? = null
    var components: Components? = null
    var security: List<SecurityRequirement>? = null
    var tags: List<Tag>? = null
    var externalDocs: ExternalDocs? = null

    fun openApi(block: () -> String) {
        this.openApi = block()
    }

    fun info(block: Info.() -> Unit) {
        this.info = Info(block)
    }

    fun servers(block: Servers.() -> Unit) {
        this.servers = Servers(block).servers
    }

    fun paths(block: Paths.() -> Unit) {
        this.paths = Paths(block).paths
    }

    fun components(block: Components.() -> Unit) {
        this.components = Components(block)
    }

    fun security(block: SecurityRequirements.() -> Unit) {
        this.security = SecurityRequirements(block).securityRequirements
    }

    fun tags(block: Tags.() -> Unit) {
        this.tags = Tags(block).tags
    }

    fun externalDocs(block: ExternalDocs.() -> Unit) {
        this.externalDocs = ExternalDocs(block)
    }
}
