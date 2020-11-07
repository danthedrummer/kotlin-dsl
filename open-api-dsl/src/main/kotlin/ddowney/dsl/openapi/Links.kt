package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Links() {

    constructor(block: Links.() -> Unit) : this() {
        apply(block)
    }

    var links = mutableMapOf<String, Link>()

    fun link(name: String, block: Link.() -> Unit) {
        this.links[name] = Link(block)
    }

}