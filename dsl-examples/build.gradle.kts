plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "ddowney.dsl.examples"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("org.yaml:snakeyaml:1.21")
    implementation(project(":open-api-dsl"))

    testImplementation("junit", "junit", "4.12")
}
