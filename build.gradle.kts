plugins {
    id("io.izzel.taboolib") version "1.31"
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    id("org.jetbrains.dokka") version "1.6.0"
    java
}

group = "com.faithl"
version = "1.0-SNAPSHOT"

taboolib {
    install("common")
    install("common-5")
    install("platform-bukkit")
    install("module-lang")
    install("module-ui")
    install("module-chat")
    install("module-configuration")
    install("module-metrics")
    install("module-database")
    install("module-kether")
    install("module-nms")
    install("module-nms-util")
    classifier = null
    version = "6.0.6-14"
    description {
        contributors {
            name("Leosouthey")
        }
        links{
            name("homepage").url("https://forum.faithl.com")
        }
        dependencies {
            name("PlaceholderAPI").optional(true)
            name("Zaphkiel").optional(true)
        }
    }
}

repositories {
    mavenCentral()
    maven { url = uri("https://repo2s.ptms.ink/repository/maven-releases") }
    maven { url = uri("https://repo.pcgamingfreaks.at/repository/maven-everything") }
    maven { url = uri("https://nexus.badbones69.com/repository/maven-releases") }
    maven { url = uri("https://jitpack.io") }
}

dependencies {
    implementation("ink.ptms.core:v11800:11800:api")
    implementation("ink.ptms.core:v11800:11800:mapped")
    implementation("ink.ptms.core:v11800:11800:universal")
    compileOnly("com.alibaba:fastjson:1.2.78")
    compileOnly("org.jetbrains.kotlin:kotlin-stdlib:1.6.0")
    compileOnly("ink.ptms:Zaphkiel:1.7.6")
    compileOnly(fileTree("libs"))
    compileOnly(kotlin("stdlib"))
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.6.0")
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

configure<JavaPluginExtension> {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}