package com.ddowney.dsl

@OpenApiDslMarker
class Link() {

    constructor(block: Link.() -> Unit) : this() {
        apply(block)
    }

    var operationRef: String? = null
    var operationId: String? = null
    var parameters: Map<String, Any>? = null
    var requestBody: Any? = null
    var description: String? = null
    var server: Server? = null

    fun operationRef(block: () -> String) {
        this.operationRef = block()
    }

    fun operationId(block: () -> String) {
        this.operationId = block()
    }

    fun parameters(block: AnyMapReceiver.() -> Unit) {
        this.parameters = AnyMapReceiver(block).map
    }

    fun requestBody(block: () -> Any) {
        this.requestBody = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun server(block: Server.() -> Unit) {
        this.server = Server(block)
    }

}