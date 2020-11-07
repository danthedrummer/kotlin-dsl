package com.ddowney.dsl

@OpenApiDslMarker
class RequestBodies() {

    constructor(block: RequestBodies.() -> Unit) : this() {
        apply(block)
    }

    fun test(block: String.() -> Unit) {

    }

    var requestBodies = mutableMapOf<String, RequestBody>()

    fun requestBody(name: String, block: RequestBody.() -> Unit) {
        this.requestBodies[name] = RequestBody(block)
    }

}