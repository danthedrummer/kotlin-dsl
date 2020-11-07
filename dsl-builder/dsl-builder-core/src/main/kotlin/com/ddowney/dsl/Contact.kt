package com.ddowney.dsl

@OpenApiDslMarker
class Contact() {

    constructor(block: Contact.() -> Unit) : this() {
        block()
    }

    private var name: String? = null
    private var url: String? = null
    private var email: String? = null

    fun name(block: () -> String) {
        this.name = block()
    }

    fun url(block: () -> String) {
        this.url = block()
    }

    fun email(block: () -> String) {
        this.email = block()
    }

}