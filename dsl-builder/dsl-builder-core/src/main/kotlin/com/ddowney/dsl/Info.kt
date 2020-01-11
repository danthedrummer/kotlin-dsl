package com.ddowney.dsl

fun createInfo(block: Info.() -> Unit): Info {
    return Info()(block)
}

class Info {

    private var title: String? = null
    private var description: String? = null
    private var termsOfService: String? = null
    private var contact: Contact? = null
    private var license: Any? = null
    private var version: String? = null

    operator fun invoke(block: Info.() -> Unit): Info = this.also(block)

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
        this.contact = Contact()(block)
    }

    fun license(block: License.() -> Unit) {
        this.license = License()(block)
    }

    fun version(block: () -> String) {
        this.version = block()
    }
}