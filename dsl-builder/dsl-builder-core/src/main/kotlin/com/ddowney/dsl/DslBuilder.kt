package com.ddowney.dsl

import com.google.gson.GsonBuilder

private val gson = GsonBuilder().setPrettyPrinting().create()

fun main() {

    val doc = createDocument {
        openApi { "3.0.0" }
        info {
            title { "Connect API" }
            version { "1.0.1" }
            description { "API specification for the Connect API" }
            termsOfService { "tos.example" }
            contact {
                name { "Frank Reynolds" }
                email { "thewarthog@example.com" }
                url { "paddyspub.example" }
            }
            license {
                name { "Literally the best license" }
                url { "awesomelicense.example" }
            }
        }
        servers {
            variables {
                variable("port") {
                    default { "8443" }
                    enumerations {
                        enumeration { "8443" }
                        enumeration { "443" }
                    }
                }
            }
        }
    }

    println(gson.toJson(doc))

}