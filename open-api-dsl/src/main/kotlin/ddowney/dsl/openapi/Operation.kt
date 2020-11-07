package ddowney.dsl.openapi

@OpenApiDslMarker
class Operation() {

    constructor(block: Operation.() -> Unit) : this() {
        apply(block)
    }

    var tags: MutableList<String>? = null
    var summary: String? = null
    var description: String? = null
    var externalDocs: ExternalDocs? = null
    var operationId: String? = null
    var parameters: MutableList<Parameter>? = null
    var requestBody: RequestBody? = null
    var responses: Responses? = null
    var callbacks: MutableMap<String, Path>? = null
    var deprecated: Boolean? = null
    var security: MutableList<SecurityRequirement>? = null
    var servers: MutableList<Server>? = null

    fun tags(block: TagReferences.() -> Unit) {
        this.tags = TagReferences(block).tagReferences
    }

    fun summary(block: () -> String) {
        this.summary = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun externalDocs(block: ExternalDocs.() -> Unit) {
        this.externalDocs = ExternalDocs(block)
    }

    fun operationId(block: () -> String) {
        this.operationId = block()
    }

    fun parameters(block: Parameters.() -> Unit) {
        this.parameters = Parameters(block).parameters
    }

    fun requestBody(block: RequestBody.() -> Unit) {
        this.requestBody = RequestBody(block)
    }

    fun responses(block: Responses.() -> Unit) {
        this.responses = Responses(block)
    }

    fun callbacks(block: Callbacks.() -> Unit) {
        this.callbacks = Callbacks(block).callbacks
    }

    fun deprecated(block: () -> Boolean) {
        this.deprecated = block()
    }

    //TODO: Figure out a nicer way to handle this, it looks messy af in the DSL
    fun security(block: SecurityRequirements.() -> Unit) {
        this.security = SecurityRequirements(block).securityRequirements
    }

    fun servers(block: Servers.() -> Unit) {
        this.servers = Servers(block).servers
    }

}