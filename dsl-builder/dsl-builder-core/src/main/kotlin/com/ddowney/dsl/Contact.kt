package com.ddowney.dsl

fun createContact(block: Contact.() -> Unit): Contact = Contact()(block)

class Contact {

    private var name: String? = null
    private var url: String? = null
    private var email: String? = null

    operator fun invoke(block: Contact.() -> Unit): Contact = this.also(block)

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