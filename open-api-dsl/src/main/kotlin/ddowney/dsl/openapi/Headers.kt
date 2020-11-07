package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Headers() {

    constructor(block: Headers.() -> Unit) : this() {
        apply(block)
    }

    var headers = mutableMapOf<String, Header>()

    fun header(name: String, block: Header.() -> Unit) {
        this.headers[name] = Header(block)
    }

}