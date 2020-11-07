plugins {
    java
    kotlin("jvm") version "1.4.10"
}

group = "ddowney.dsl"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.google.code.gson:gson:2.8.6")
    implementation("org.yaml:snakeyaml:1.21")

    testImplementation("junit:junit:4.12")
}