package ddowney.dsl.openapi

import kotlinx.serialization.Serializable

@OpenApiDslMarker
@Serializable
class Parameter() {

    constructor(block: Parameter.() -> Unit) : this() {
        apply(block)
    }

    var name: String? = null
    var _in: String? = null
    var description: String? = null
    var required: Boolean? = null
    var deprecated: Boolean? = null
    var allowEmptyValue: Boolean? = null

    fun name(block: () -> String) {
        this.name = block()
    }

    fun _in(block: () -> String) {
        this._in = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun required(block: () -> Boolean) {
        this.required = block()
    }

    fun deprecated(block: () -> Boolean) {
        this.deprecated = block()
    }

    fun allowEmptyValue(block: () -> Boolean) {
        this.allowEmptyValue = block()
    }
}