package com.ddowney.dsl

sealed class BaseSchema {

    private var title: String? = null
//    private var description: String? = null
//    private var required: Boolean = false
//    private var tester: Tester? = null

    operator fun invoke(action: BaseSchema.() -> Unit): BaseSchema {
        this.action()
        return this
    }

    fun title(title: () -> String) {
        this.title = title()
    }

//    fun description(description: () -> String) {
//        this.description = description()
//    }
//
//    fun required(required: () -> Boolean) {
//        this.required = required()
//    }
//
//    fun tester(block: Tester.() -> Unit) {
//        val tester = Tester()
//        block(tester)
//        this.tester = tester
//    }

}

//fun tester(block: Tester.() -> Unit): Tester {
//    val tester = Tester()
//    tester(block)
//    return tester
//}
//
//class Tester {
//
//    private var field: String? = null
//
//    operator fun invoke(action: Tester.() -> Unit): Tester {
//        this.action()
//        return this
//    }
//
//    fun field(field: () -> String) {
//        this.field = field()
//    }
//}
