package ddowney.dsl.openapi

@OpenApiDslMarker
class MediaTypes() {

    constructor(block: MediaTypes.() -> Unit) : this() {
        apply(block)
    }

    var mediaTypes = mutableMapOf<String, MediaType>()

    fun mediaType(name: String, block: MediaType.() -> Unit) {
        this.mediaTypes[name] = MediaType(block)
    }

}