package com.ddowney.dsl

@OpenApiDslMarker
class Path() {

    constructor(block: Path.() -> Unit) : this() {
        apply(block)
    }

    var _ref: String? = null
    var summary: String? = null
    var description: String? = null
    var get: Operation? = null
    var put: Operation? = null
    var post: Operation? = null
    var delete: Operation? = null
    var options: Operation? = null
    var head: Operation? = null
    var patch: Operation? = null
    var trace: Operation? = null
    var servers: List<Server>? = null
    var parameters: List<Any>? = null //TODO: Implement parameters

    fun _ref(block: () -> String) {
        this._ref = block()
    }

    fun summary(block: () -> String) {
        this.summary = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun get(block: Operation.() -> Unit) {
        this.get = Operation(block)
    }

    fun put(block: Operation.() -> Unit) {
        this.put = Operation(block)
    }

    fun post(block: Operation.() -> Unit) {
        this.post = Operation(block)
    }

    fun delete(block: Operation.() -> Unit) {
        this.delete = Operation(block)
    }

    fun options(block: Operation.() -> Unit) {
        this.options = Operation(block)
    }

    fun head(block: Operation.() -> Unit) {
        this.head = Operation(block)
    }

    fun patch(block: Operation.() -> Unit) {
        this.patch = Operation(block)
    }

    fun trace(block: Operation.() -> Unit) {
        this.trace = Operation(block)
    }

    fun servers(block: Servers.() -> Unit) {
        this.servers = Servers(block).servers
    }

    fun parameters(block: Any.() -> Unit) {
        this.parameters = listOf() //TODO: Implement parameters
    }
}