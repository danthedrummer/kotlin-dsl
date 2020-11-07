package com.ddowney.dsl

@OpenApiDslMarker
class AnyMapReceiver() {

    constructor(block: AnyMapReceiver.() -> Unit) : this() {
        apply(block)
    }

    var map = mutableMapOf<String, Any>()

    fun entry(name: String, block: () -> Any) {
        this.map[name] = block()
    }

}