package com.fate.buildsrc

object Versions {
  const val buildTools = "30.0.2"
  const val compileSdk = 30
  const val gradlePlugin = "4.0.2"
  const val minSdk = 26
  const val targetSdk = 30
}

object Libs {
  const val android_gradle_plugin = "com.android.tools.build:gradle:4.1.3"

  object Mavericks {
    private const val version = "2.1.0"
    const val mavericks = "com.airbnb.android:mavericks:$version"
    const val navigation = "com.airbnb.android:mavericks-navigation:$version"
  }

  object TENCENT {
    const val wechat = "com.tencent.mm.opensdk:wechat-sdk-android-without-mta:6.6.21"
    const val mmkv = "com.tencent:mmkv-static:1.2.7"
  }

  object Dagger {
    private const val version = "2.31.2-alpha"
    private const val android_version = "1.0.0-alpha03"
    const val plugin = "com.google.dagger:hilt-android-gradle-plugin:$version"
    const val dagger = "com.google.dagger:dagger:$version"
    const val hilt = "com.google.dagger:hilt-android:$version"
//    const val navigation = "androidx.hilt:hilt-navigation:$android_version"
//        const val viewmodel = "androidx.hilt:hilt-lifecycle-viewmodel:$viewmodel_version"

    object Apt {
      const val dagger = "com.google.dagger:dagger-compiler:$version"
      const val hilt = "com.google.dagger:hilt-android-compiler:$version"
//            const val viewmodel = "androidx.hilt:hilt-compiler:$viewmodel_version"
    }

  }

  object Kotlin {
    /**
     * 修改kotlin版本的时候需要同时对build.gradle.kts进行修改
     * */
    const val version = "1.4.31"
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$version"
    const val plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"

  }

  object Androidx {
    const val jetpack = "1.2.0"
    const val appcompat = "androidx.appcompat:appcompat:$jetpack"
    const val core = "androidx.core:core-ktx:1.5.0-beta01"
    const val material = "com.google.android.material:material:1.2.1"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.4"

    //    const val navigation = "androidx.navigation:navigation-compose:1.0.0-alpha06"
    object Navigation {
      private const val version = "2.3.3"
      const val runtime = "androidx.navigation:navigation-runtime-ktx:$version"
      const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
      const val ui = "androidx.navigation:navigation-ui-ktx:$version"

    }

    object Lifecycle {
      private const val version = "2.3.0"
      const val common_java8 = "android.arch.lifecycle:common-java8:${version}"
      const val runtime = "androidx.lifecycle:lifecycle-runtime-ktx:${version}"
      const val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${version}"
    }

    object KTX {
      const val activity = "androidx.activity:activity-ktx:1.2.0"
      const val fragment = "androidx.fragment:fragment-ktx:1.2.5"
    }

    object Compose {
      const val version = "1.0.0-alpha11"
      const val animation = "androidx.compose.animation:animation:$version"
      const val runtime = "androidx.compose.runtime:runtime:$version"
      const val material = "androidx.compose.material:material:$version"
      const val ui = "androidx.compose.ui:ui:$version"
      const val ui_tools = "androidx.compose.ui:ui-tooling:$version"

      //            const val ui_layout = "androidx.compose.ui:ui-layout:$version"
      const val ui_util = "androidx.compose.ui:ui-util:$version"
      const val foundation = "androidx.compose.foundation:foundation:$version"
      const val foundation_layout = "androidx.compose.foundation:foundation-layout:$version"
      const val livedata = "androidx.compose.runtime:runtime-livedata:$version"
    }

    object DataStore {
      private const val version = "1.0.0-alpha06"
      const val data_store_core = "androidx.datastore:datastore-core:$version"
      const val data_store = "androidx.datastore:datastore:$version"
    }

    object Room {
      private const val version = "2.2.6"
      const val room = "androidx.room:room-ktx:$version"

      object Apt {
        const val room = "androidx.room:room-compiler:$version"
      }
    }
  }

  object Accompanist {
    private const val version = "0.5.0"
    const val coil = "dev.chrisbanes.accompanist:accompanist-coil:$version"
    const val insets = "dev.chrisbanes.accompanist:accompanist-insets:$version"
  }

  object Coroutines {
    private const val version = "1.4.2"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$version"
  }

  object Retrofit {
    private const val version = "2.9.0"
    const val retrofit = "com.squareup.retrofit2:retrofit:$version"
    const val moshi = "com.squareup.retrofit2:converter-moshi:$version"
    const val scalars = "com.squareup.retrofit2:converter-scalars:$version"
  }

  object Okhttp {
    private const val version = "4.9.0"
    const val loggin = "com.squareup.okhttp3:logging-interceptor:$version"
  }

  object Moshi {
    private const val version = "1.11.0"
    const val moshi = "com.squareup.moshi:moshi-kotlin:$version"

    object Apt {
      const val moshi = "com.squareup.moshi:moshi-kotlin-codegen:$version"
    }
  }

  object Log {
    private const val version = "4.7.1"
    const val timber = "com.jakewharton.timber:timber:$version"
  }

}

object Test {
  private const val version = "1.2.0"
  const val core = "androidx.test:core:$version"
  const val rules = "androidx.test:rules:$version"
  const val junit = "junit:junit:4.13.1"

  object Ext {
    private const val version = "1.1.2"
    const val junit = "androidx.test.ext:junit-ktx:$version"
  }

  const val espressoCore = "androidx.test.espresso:espresso-core:3.2.0"
  const val room = "androidx.room:room-testing:2.2.6"
}