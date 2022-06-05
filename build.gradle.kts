import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.6.21"
}

group = "com.IceCreamQAQ.YuQ"
version = "1.0-SNAPSHOT"

repositories {
    mavenLocal()
    maven("https://maven.icecreamqaq.com/repository/maven-public/")
}

dependencies {
    implementation(kotlin("stdlib"))
    api("com.IceCreamQAQ:YuQ:0.1.0.0-DEV32")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}