package ddowney.dsl.openapi

@OpenApiDslMarker
class ServerVariable() {

    constructor(block: ServerVariable.() -> Unit) : this() {
        apply(block)
    }

    private val enumerations: MutableList<String> = mutableListOf()
    private var default: String? = null
    private var description: String? = null

    fun enumerations(block: Enumerations.() -> Unit) {
        this.enumerations.addAll(Enumerations(block).enumerations)
    }

    fun default(block: () -> String) {
        this.default = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

}