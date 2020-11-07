package com.ddowney.dsl

@OpenApiDslMarker
class Tags() {

    constructor(block: Tags.() -> Unit) : this() {
        apply(block)
    }

    val tags = mutableListOf<Tag>()

    fun tag(block: Tag.() -> Unit) {
        tags.add(Tag(block))
    }

}