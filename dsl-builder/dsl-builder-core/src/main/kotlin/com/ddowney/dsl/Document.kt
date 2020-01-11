package com.ddowney.dsl

fun createDocument(block: Document.() -> Unit): Document = Document()(block)

class Document {

    private var openApi: String? = null
    private var info: Info? = null
    private var servers: Any? = null
    private var paths: Any? = null
    private var components: Any? = null
    private var security: Any? = null
    private var tags: Any? = null
    private var externalDocs: Any? = null

    operator fun invoke(block: Document.() -> Unit): Document = this.also(block)

    fun openApi(block: () -> String) {
        this.openApi = block()
    }

    fun info(block: Info.() -> Unit) {
        this.info =  Info()(block)
    }

    // TODO: Make into a list
    fun servers(block: Server.() -> Unit) {
        this.servers = Server()(block)
    }

    fun paths(block: () -> Any) {
        // TODO
        this.paths = block()
    }

    fun components(block: () -> Any) {
        // TODO
        this.components = block()
    }

    fun security(block: () -> Any) {
        // TODO
        this.security = block()
    }

    fun tags(block: () -> Any) {
        // TODO
        this.tags = block()
    }

    fun externalDocs(block: () -> Any) {
        // TODO
        this.externalDocs = block()
    }
}
