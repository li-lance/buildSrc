package com.fate.buildsrc

import org.gradle.testing.jacoco.tasks.JacocoReport

/**
 * Author：lilingzhang on 2020/5/15 15:31
 * email：foryun@live.com
 */
@Suppress("LeakingThis") // Gradle requires Tasks be open classes
open class JacocoReportTask : JacocoReport() {
    init {
        group = "Reporting"
        description = "Generate Jacoco coverage reports for Debug build"

        @Suppress("UnstableApiUsage")
        reports {
            xml.isEnabled = true
            html.isEnabled = true
        }

        val excludes = listOf(
            "**/R.class",
            "**/R$*.class",
            "**/BuildConfig.*",
            "**/Manifest*.*"
        )
        val buildDir = project.buildDir

        val debugTree = project.fileTree("$buildDir/intermediates/classes/debug") {
            exclude(excludes)
        }
        val kotlinDebugTree = project.fileTree("$buildDir/tmp/kotlin-classes/debug") {
            exclude(excludes)
        }

        classDirectories.from(arrayOf(debugTree), arrayOf(kotlinDebugTree))
        sourceDirectories.from(arrayOf(
            project.android.sourceSets.getByName("main").java.srcDirs,
            "${project.projectDir}/src/main/kotlin"
        ))
        executionData.from("$buildDir/jacoco/testDebugUnitTest.exec")
    }
}