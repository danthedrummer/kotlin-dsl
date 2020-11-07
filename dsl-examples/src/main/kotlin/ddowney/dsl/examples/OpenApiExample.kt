package ddowney.dsl.examples

import ddowney.dsl.openapi.Document
import com.google.gson.GsonBuilder

private val gson = GsonBuilder().setPrettyPrinting().create()

fun main() {

    val doc = Document {
        openApi { "3.0.3" }

        info {
            title { "Example API" }
            version { "2.0.0" }
            description { "API specification for an example API" }
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
        externalDocs {
            description { "Documentation for this API" }
            url { "https://example.com" }
        }
        servers {
            server {
                variables {
                    variable("port") {
                        default { "8443" }
                        enumerations {
                            enumeration { "8443" }
                            enumeration { "443" }
                        }
                    }
                    // can add multiple `variable` blocks
                }
                description { "Some server description" }
                url { "https://example.com" }
            }
            // can add multiple `server` blocks
        }
        tags {
            tag {
                name { "Example" }
                description { "Everything about your example" }
                externalDocs {
                    description { "Example documentation here" }
                    url { "https://example.com" }
                }
            }
            // can add multiple `tag` blocks
        }
        paths {
            path("/route/resource") {
                description { "A verbose explanation of the operation behavior" }
                get {
                    tags {
                        tag { "A list of tags" }
                        tag { "for documentation control" }
                        tag { "Used for logical grouping" }
                    }
                    summary { "A short summary of what the operation does." }
                    description { "Description of a GET endpoint" }
                    externalDocs {
                        description { "Example documentation here" }
                        url { "https://example.com" }
                    }
                    operationId { "Unique string used to identify the operation." }
                    parameters {
                        parameter {
                            name { "The name of the parameter" }
                            _in { "The location of the parameter" }
                            description { "A brief description of the parameter" }
                            required { false }
                            deprecated { false }
                        }
                    }
                    requestBody {
                        description { "A brief description of the request body" }
                        required { false }
                        content {
                            mediaType("application/json") {
                                schema { } //TODO: Implement schema block
                                examples {
                                    example("cat") {
                                        summary { "An example of a cat" }
                                        description { "Description of a cat" }
                                        value { "" } //TODO: Convert this into a map receiver?
                                        externalValue { "link to some external value" }
                                    }
                                }
                                encodings {
                                    encoding("property_name") {
                                        contentType { "application/json" }
                                        headers {
                                            header("X-Rate-Limit-Limit") {
                                                description { "The number of allowed requests in the current period" }
                                                name { "X-Rate-Limit-Limit" }
                                                externalDocs {
                                                    description { "some link to external docs" }
                                                    url { "example.com" }
                                                }
                                            }
                                        }
                                        style { "Describes how a specific property value will be serialized" }
                                        explode { false }
                                        allowReserved { false }
                                    }
                                }
                            }
                        }
                    }
                    responses { } //TODO: Implement responses block
                    callbacks { } //TODO: Implement callbacks block
                    deprecated { false }
                    security {
                        securityRequirement {
                            securityRequirement("auth") {
                                add("write")
                                add("read")
                            }
                        }
                    }
                    servers {
                        server {
                            variables {
                                variable("port") {
                                    default { "8443" }
                                    enumerations {
                                        enumeration { "8443" }
                                        enumeration { "443" }
                                    }
                                }
                            }
                            description { "Some server description" }
                            url { "https://example.com" }
                        }
                    }
                }
            }
        }
        components {

        }
    }

    println(gson.toJson(doc))
}