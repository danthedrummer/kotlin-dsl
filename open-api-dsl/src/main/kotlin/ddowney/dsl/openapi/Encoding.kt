package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Encoding() {

    constructor(block: Encoding.() -> Unit) : this() {
        apply(block)
    }

    var contentType: String? = null
    var headers: Map<String, Header>? = null
    var style: String? = null
    var explode: Boolean? = null
    var allowReserved: Boolean? = null

    fun contentType(block: () -> String) {
        this.contentType = block()
    }

    fun headers(block: Headers.() -> Unit) {
        this.headers = Headers(block).headers
    }

    fun style(block: () -> String) {
        this.style = block()
    }

    fun explode(block: () -> Boolean) {
        this.explode = block()
    }

    fun allowReserved(block: () -> Boolean) {
        this.allowReserved = block()
    }

}