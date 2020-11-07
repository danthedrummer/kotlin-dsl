package ddowney.dsl.openapi

@OpenApiDslMarker
class Info() {

    constructor(block: Info.() -> Unit) : this() {
        block()
    }

    private var title: String? = null
    private var description: String? = null
    private var termsOfService: String? = null
    private var contact: Contact? = null
    private var license: License? = null
    private var version: String? = null

    fun title(block: () -> String) {
        this.title = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun termsOfService(block: () -> String) {
        this.termsOfService = block()
    }

    fun contact(block: Contact.() -> Unit) {
        this.contact = Contact(block)
    }

    fun license(block: License.() -> Unit) {
        this.license = License(block)
    }

    fun version(block: () -> String) {
        this.version = block()
    }
}