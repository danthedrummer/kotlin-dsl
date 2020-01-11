package com.ddowney.dsl

fun createServer(block: Server.() -> Unit): Server = Server()(block)

class Server {

    private var url: String? = null
    private var description: String? = null
    private val variables: MutableMap<String, ServerVariable> = mutableMapOf()

    operator fun invoke(block: Server.() -> Unit): Server = this.also(block)

    fun url(block: () -> String) {
        this.url = block()
    }

    fun description(block: () -> String) {
        this.description = block()
    }

    fun variables(block: ServerVariablesReceiver.() -> Unit) {
        this.variables.putAll(ServerVariablesReceiver()(block))
    }

}

class ServerVariablesReceiver : HashMap<String, ServerVariable>() {

    operator fun invoke(block: ServerVariablesReceiver.() -> Unit): ServerVariablesReceiver = this.also(block)

    fun variable(name: String, block: ServerVariable.() -> Unit) {
        put(name, ServerVariable()(block))
    }
}

