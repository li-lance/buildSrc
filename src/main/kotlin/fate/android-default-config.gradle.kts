package fate

import com.android.build.gradle.BaseExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

configure<BaseExtension> {
    compileSdkVersion(31)
    defaultConfig {
        minSdk = 26
        targetSdk = 31
        versionCode = 1
        versionName = project.version.toString()
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }

    lintOptions {
//        lintConfig = rootProject.file("lint.xml")
        isCheckReleaseBuilds = false
        isIgnoreTestSources = true
        isWarningsAsErrors = true
    }

    testOptions {
        unitTests.isIncludeAndroidResources = true
    }

    filterVariantsFromArguments()
}

/**
 * Filter Android variants by command line arguments. Filters nothing if no argument is given.
 *
 * E.g. `gradle assemble -Pvariants=debug,staging`
 */
fun BaseExtension.filterVariantsFromArguments() {
    val variantsArguments = properties["variants"] as? String
    variantsArguments?.let {
        val variants = it.split(',')
        variantFilter {
            val ignoreVariant = !variants.contains(name)
            if (ignoreVariant) logger.info("Ignoring variant: $name")
            ignore = ignoreVariant
        }
    }
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        jvmTarget = "1.8"
    }
}