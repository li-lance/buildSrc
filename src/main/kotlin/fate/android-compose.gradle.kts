package fate

import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.plugin.PLUGIN_CLASSPATH_CONFIGURATION_NAME

@Suppress("UnstableApiUsage")
configure<BaseExtension> {
    buildFeatures.apply {
        compose = true
    }
}

dependencies {
    add(PLUGIN_CLASSPATH_CONFIGURATION_NAME, platform(project(":dependencies")))
    add(PLUGIN_CLASSPATH_CONFIGURATION_NAME, "androidx.compose.compiler:compiler")

    "implementation"("androidx.compose.runtime:runtime")
    "implementation"("androidx.compose.ui:ui")
    "implementation"("androidx.compose.ui:ui-util")
    "implementation"("androidx.compose.ui:ui-tooling")
    "implementation"("androidx.compose.foundation:foundation")
    "implementation"("androidx.compose.material:material")
    "implementation"("androidx.compose.material:material-icons-core")
    "implementation"("androidx.compose.material:material-icons-extended")
    "implementation"("com.google.android.material:compose-theme-adapter")

    "implementation"("androidx.activity:activity-compose")
    "implementation"("androidx.constraintlayout:constraintlayout-compose")
    "implementation"("androidx.lifecycle:lifecycle-viewmodel-compose")

    "androidTestImplementation"("androidx.compose.ui:ui-test-junit4")
}
