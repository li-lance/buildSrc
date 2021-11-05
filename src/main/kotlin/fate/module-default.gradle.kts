package fate

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile


tasks.withType<KotlinCompile> {
    kotlinOptions.freeCompilerArgs += "-Xopt-in=kotlin.RequiresOptIn"
}

manageDependenciesFor("java-base", "implementation", "testImplementation")
manageDependenciesFor("com.android.application", "androidTestImplementation")
manageDependenciesFor("com.android.library", "androidTestImplementation")
manageDependenciesFor("kotlin-kapt", "kapt")

fun manageDependenciesFor(requiredPluginId: String, vararg configurations: String) {
    pluginManager.withPlugin(requiredPluginId) {
        dependencies {
            configurations.forEach { configurationName ->
                configurationName(platform(project(":dependencies")))
            }
        }
    }
}
