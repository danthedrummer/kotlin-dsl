# OpenApi DSL

This module contains my attempt to express the [OpenApi specification](https://swagger.io/specification/) as a [Kotlin DSL](https://kotlinlang.org/docs/reference/type-safe-builders.html) to enable expressive and type-safe construction of REST API documentation.

## Basic Usage

1. Begin by opening the `Document` closure:
    ```kotlin
    val doc = Document {
    
    }
    ```

1. The DSL should only allow you to access the appropriate section of the specification for the scope you are
 currently in. So for `Document` you can access the following:
    ```kotlin
    val doc = Document {
        openApi {  }
        info {  }
        servers { }
        paths { }
        components {  }
        security {  }
        tags { }
        externalDocs {  }
    }
    ```

1. Each new scope will present the next section of the specification.
1. At the end you will have a Kotlin object which you can parse into JSON or YAML as needed to check into version
 control or plug into code generation tools.
 