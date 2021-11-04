plugins {
    `kotlin-dsl`
}

repositories {
    google()
    maven { url = uri("https://plugins.gradle.org/m2/") }
}

dependencies {
    // buildSrc dependencies
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")
    val okHttpVersion = "4.9.2"
    implementation("com.squareup.okhttp3:okhttp:$okHttpVersion")
    implementation("com.squareup.okhttp3:logging-interceptor:$okHttpVersion")

    // plugins for main build
    val kotlinVersion = "1.5.31"
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("com.android.tools.build:gradle:7.0.3")
    implementation("com.vanniktech:gradle-dependency-graph-generator-plugin:0.5.0")
    implementation("io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.14.2")
    implementation("androidx.navigation:navigation-safe-args-gradle-plugin:2.3.5")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}
