package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Servers() {

    constructor(block: Servers.() -> Unit) : this() {
        apply(block)
    }

    internal val servers = mutableListOf<Server>()

    fun server(block: Server.() -> Unit) {
        val ser = Server(block)
        servers.add(ser)
    }

}