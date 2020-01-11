package com.ddowney.dsl

fun createLicense(block: License.() -> Unit): License = License()(block)

class License {

    private var name: String? = null
    private var url: String? = null

    operator fun invoke(block: License.() -> Unit): License = this.apply(block)

    fun name(block: () -> String) {
        this.name = block()
    }

    fun url(block: () -> String) {
        this.url = block()
    }

}