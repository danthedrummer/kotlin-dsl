plugins {
    java
    kotlin("jvm") version "1.4.10"
    kotlin("plugin.serialization") version "1.4.10"
}

group = "ddowney.dsl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.0.1")

    testImplementation("junit:junit:4.12")
}