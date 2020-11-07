package ddowney.dsl.openapi

@OpenApiDslMarker
class Parameters() {

    constructor(block: Parameters.() -> Unit) : this() {
        apply(block)
    }

    var parameters = mutableListOf<Parameter>()

    fun parameter(block: Parameter.() -> Unit) {
        this.parameters.add(Parameter(block))
    }

}