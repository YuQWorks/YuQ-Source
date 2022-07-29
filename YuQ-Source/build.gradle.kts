plugins {
    kotlin("jvm")
    kotlin("plugin.serialization") version "1.7.10"
}

dependencies{
    implementation(kotlin("stdlib"))
    api("com.IceCreamQAQ:YuQ:0.1.0.0-DEV32")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.3.3")
}