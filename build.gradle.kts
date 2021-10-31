import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar;

plugins {
    java
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

repositories {
    mavenLocal()
//    maven("https://repo.codemc.io/repository/nms/")
    maven("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
//    maven("https://oss.sonatype.org/content/repositories/snapshots")
//    maven("https://jitpack.io")
    maven("https://repo.extendedclip.com/content/repositories/placeholderapi/")
    maven("https://repo.maven.apache.org/maven2/")
}

dependencies {
//    implementation("com.github.heychazza:spigot-plugin-lib:master-SNAPSHOT")
//    implementation("redis.clients:jedis:3.6.0")
//    implementation("net.jafama:jafama:2.3.2")
    implementation("net.sf.trove4j:trove4j:3.0.3")
    compileOnly("org.spigotmc:spigot-api:1.8.8-R0.1-SNAPSHOT")
    compileOnly("com.google.code.gson:gson:2.8.9")
}

group = "net.analyse"
version = "1.0.0"
description = "Analyse"
java.sourceCompatibility = JavaVersion.VERSION_1_8

//tasks.withType<ShadowJar> {
//    relocate("com.codeitforyou.lib", "${project.group}.spoof.lib")
//    relocate("net.jafama", "${project.group}.spoof.math")
//    relocate("redis.clients", "${project.group}.spoof.redis")
//}

tasks.withType<JavaCompile>() {
    options.encoding = "UTF-8"
}