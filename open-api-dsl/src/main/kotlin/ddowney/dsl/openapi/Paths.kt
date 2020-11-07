package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Paths() {

    constructor(block: Paths.() -> Unit) : this() {
        apply(block)
    }

    val paths: MutableMap<String, Path> = mutableMapOf()

    fun path(path: String, block: Path.() -> Unit) {
        this.paths[path] = Path(block)
    }

}