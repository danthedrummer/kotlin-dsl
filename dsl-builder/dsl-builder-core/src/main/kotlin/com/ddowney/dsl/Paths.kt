package com.ddowney.dsl

@OpenApiDslMarker
class Paths() {

    constructor(block: Paths.() -> Unit) : this() {
        apply(block)
    }

    val paths: MutableMap<String, Path> = mutableMapOf()

    fun path(path: String, block: Path.() -> Unit) {
        this.paths[path] = Path(block)
    }

}