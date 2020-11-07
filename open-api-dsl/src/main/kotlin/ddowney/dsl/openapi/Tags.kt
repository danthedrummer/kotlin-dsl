package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Tags() {

    constructor(block: Tags.() -> Unit) : this() {
        apply(block)
    }

    val tags = mutableListOf<Tag>()

    fun tag(block: Tag.() -> Unit) {
        tags.add(Tag(block))
    }

}