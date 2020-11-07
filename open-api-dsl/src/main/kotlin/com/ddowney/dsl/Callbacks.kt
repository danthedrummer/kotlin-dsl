package com.ddowney.dsl

@OpenApiDslMarker
class Callbacks() {

    constructor(block: Callbacks.() -> Unit) : this() {
        apply(block)
    }

    var callbacks = mutableMapOf<String, Path>()

    fun callback(name: String, block: Path.() -> Unit) {
        this.callbacks[name] = Path(block)
    }

}