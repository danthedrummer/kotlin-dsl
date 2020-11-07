package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class MediaTypes() {

    constructor(block: MediaTypes.() -> Unit) : this() {
        apply(block)
    }

    var mediaTypes = mutableMapOf<String, MediaType>()

    fun mediaType(name: String, block: MediaType.() -> Unit) {
        this.mediaTypes[name] = MediaType(block)
    }

}