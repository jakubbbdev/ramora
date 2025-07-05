plugins {
    id("java")
}

group = "dev.jakubbb.ramora"

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.38")
    annotationProcessor("org.projectlombok:lombok:1.18.38")

    implementation("com.gradleup.shadow:shadow-gradle-plugin:8.3.7")
    implementation("net.thebugmc.gradle.sonatype-central-portal-publisher:net.thebugmc.gradle.sonatype-central-portal-publisher.gradle.plugin:1.2.4")
    implementation("org.cthing.build-constants:org.cthing.build-constants.gradle.plugin:2.0.0")

    compileOnly(gradleApi())
    testImplementation(gradleTestKit())

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter:5.13.2")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.13.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.13.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.13.2")

    testImplementation("org.assertj:assertj-core:3.27.3")
    testImplementation("org.cthing:assertj-gradle:3.0.0")
}

tasks.test {
    useJUnitPlatform()
}


java {
    withSourcesJar()
    withJavadocJar()
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
}