package ddowney.dsl.openapi

@OpenApiDslMarker
class Server() {

    constructor(block: Server.() -> Unit) : this() {
        apply(block)
    }

    private var url: String? = null
    private var description: String? = null
    private var variables: MutableMap<String, ServerVariable>? = null

    fun url(block: () -> String) {
        this.url = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun variables(block: ServerVariables.() -> Unit) {
        this.variables = ServerVariables(block).serverVariables
    }
}


