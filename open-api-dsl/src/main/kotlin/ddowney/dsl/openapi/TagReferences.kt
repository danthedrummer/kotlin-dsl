package ddowney.dsl.openapi

@OpenApiDslMarker
class TagReferences() {

    constructor(block: TagReferences.() -> Unit) : this() {
        apply(block)
    }

    var tagReferences = mutableListOf<String>()

    fun tag(block: () -> String) {
        this.tagReferences.add(block())
    }

}