object Lib {

  object AndroidX {
    const val activityKtx = "androidx.activity:activity-ktx"
    const val annotations = "androidx.annotation:annotation"
    const val appcompat = "androidx.appcompat:appcompat"
    const val browser = "androidx.browser:browser"
    const val constraintlayout = "androidx.constraintlayout:constraintlayout"
    const val coordinatorlayout = "androidx.coordinatorlayout:coordinatorlayout"
    const val coreKtx = "androidx.core:core-ktx"
    const val coreSplash = "androidx.core:core-splashscreen"
    const val drawerlayout = "androidx.drawerlayout:drawerlayout"
    const val dynamicAnimationKtx = "androidx.dynamicanimation:dynamicanimation-ktx"
    const val fragmentKtx = "androidx.fragment:fragment-ktx"
    const val lifecycleCommon = "androidx.lifecycle:lifecycle-common"
    const val lifecycleCommonJava8 = "androidx.lifecycle:lifecycle-common-java8"
    const val lifecycleLivedata = "androidx.lifecycle:lifecycle-livedata"
    const val lifecycleLivedataKtx = "androidx.lifecycle:lifecycle-livedata-ktx"
    const val lifecycleRuntimeKtx = "androidx.lifecycle:lifecycle-runtime-ktx"
    const val lifecycleProcess = "androidx.lifecycle:lifecycle-process"
    const val lifecycleViewmodelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx"
    const val navigationFragmentKtx = "androidx.navigation:navigation-fragment-ktx"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx"
    const val pagingRuntime = "androidx.paging:paging-runtime"
    const val preferenceKtx = "androidx.preference:preference-ktx"
    const val transition = "androidx.transition:transition"
    const val recyclerview = "androidx.recyclerview:recyclerview"
    const val recyclerviewSelection = "androidx.recyclerview:recyclerview-selection"
    const val roomCompiler = "androidx.room:room-compiler"
    const val roomRuntime = "androidx.room:room-runtime"
    const val roomKtx = "androidx.room:room-ktx"
    const val securityCrypto = "androidx.security:security-crypto"
    const val startup = "androidx.startup:startup-runtime"
    const val swiperefreshlayout = "androidx.swiperefreshlayout:swiperefreshlayout"
    const val viewpager2 = "androidx.viewpager2:viewpager2"
    const val webkit = "androidx.webkit:webkit"
    const val workManager = "androidx.work:work-runtime-ktx"
    const val dataStore = "androidx.datastore:datastore-preferences"
    const val documentfile = "androidx.documentfile:documentfile"

    object Test {
      const val archCoreTesting = "androidx.arch.core:core-testing"
      const val coreKtx = "androidx.test:core-ktx"
      const val extJunit = "androidx.test.ext:junit"
      const val extRules = "androidx.test:rules"
      const val runner = "androidx.test:runner"
      const val uiAutomator = "androidx.test.uiautomator:uiautomator"
      const val workManager = "androidx.work:work-testing"
    }
  }

  object Firebase {
    const val core = "com.google.firebase:firebase-core"
    const val cloudMessaging = "com.google.firebase:firebase-messaging"
    const val config = "com.google.firebase:firebase-config-ktx"
  }

  object Google {
    const val googlePlaces = "com.google.android.libraries.places:places"
    const val maps = "com.google.android.libraries.maps:maps"
    const val mapsKtx = "com.google.maps.android:maps-v3-ktx"
    const val mapsUtils = "com.google.maps.android:android-maps-utils-v3"
    const val mapsUtilsKtx = "com.google.maps.android:maps-utils-v3-ktx"
    const val autoValueAnnotations = "com.google.auto.value:auto-value-annotations"
  }

  object GooglePlayServices {
    const val location = "com.google.android.gms:play-services-location"
    const val tasks = "com.google.android.gms:play-services-tasks"
    const val basement = "com.google.android.gms:play-services-basement"
    const val base = "com.google.android.gms:play-services-base"
    const val gcm = "com.google.android.gms:play-services-gcm"
    const val textRecognition = "com.google.android.gms:play-services-mlkit-text-recognition"
  }

  object Koin {
    const val android = "io.insert-koin:koin-android"
    const val androidCompose = "io.insert-koin:koin-androidx-compose"
    const val core = "io.insert-koin:koin-core"
    const val test = "io.insert-koin:koin-test"
  }

  object KotlinX {
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core"
    const val coroutinesTest = "org.jetbrains.kotlinx:kotlinx-coroutines-test"
    const val dateTime = "org.jetbrains.kotlinx:kotlinx-datetime"
    const val serialization = "org.jetbrains.kotlinx:kotlinx-serialization-core"
    const val serializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json"
    const val io = "org.jetbrains.kotlinx:kotlinx-io-jvm"
  }

  object Camera {
    const val camera2 = "androidx.camera:camera-camera2"
    const val cameraLifeCycle = "androidx.camera:camera-lifecycle"
    const val cameraView = "androidx.camera:camera-view"
  }

  object AMap {
    const val map = "com.amap.api:3dmap"
    const val location = "com.amap.api:location"
    const val search = "com.amap.api:search"
  }

  object Accompanist {
    const val pager = "com.google.accompanist:accompanist-pager"
    const val insets = "com.google.accompanist:accompanist-insets"
  }

  object Chucker {
    const val debug = "com.github.chuckerteam.chucker:library"
    const val release = "com.github.chuckerteam.chucker:library-no-op"
  }

  object Tencent {
    const val bugly = "com.tencent.bugly:crashreport"
  }

  object Dagger {
    const val dagger = "com.google.dagger:dagger"
    const val daggerCompiler = "com.google.dagger:dagger-compiler"
    const val daggerAndroid = "com.google.dagger:dagger-android"
    // if you use the support libraries
    const val daggerAndroidSupport = "com.google.dagger:dagger-android-support"
    const val daggerAndroidCompiler = "com.google.dagger:dagger-android-processor"
    const val hilt = "com.google.dagger:hilt-android"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler"
    const val composeNavigation = "androidx.hilt:hilt-navigation-compose:"
  }

  object Retrofit {
    const val retrofit = "com.squareup.retrofit2:retrofit"
    const val retrofitMoshi = "com.squareup.retrofit2:converter-moshi"
    const val retrofitScalars = "com.squareup.retrofit2:converter-scalars"
    const val retrofitGson = "com.squareup.retrofit2:converter-gson"
    const val retrofitJackson = "com.squareup.retrofit2:converter-jackson"
  }

  const val appAuth = "net.openid:appauth"
  const val applandeoCalendar = "com.applandeo:material-calendar-view"
  const val arrowCoreData = "io.arrow-kt:arrow-core-data"
  const val bartekscPdfViewer = "com.github.barteksc:android-pdf-viewer"
  const val betterBarCodes = "com.github.wrdlbrnft:better-barcodes"
  const val coil = "io.coil-kt:coil"
  const val coilCompose = "io.coil-kt:coil-compose"
  const val exoplayerCore = "com.google.android.exoplayer:exoplayer-core"
  const val exoplayerUi = "com.google.android.exoplayer:exoplayer-ui"
  const val flexbox = "com.google.android.flexbox:flexbox"
  const val firebaseAnalytics = "com.google.firebase:firebase-analytics-ktx"
  const val gson = "com.google.code.gson:gson"
  const val hamcrest = "org.hamcrest:hamcrest"
  const val jsonObjectMock = "org.json:json"
  const val junit4 = "junit:junit"
  const val kotlinLogging = "io.github.microutils:kotlin-logging"
  const val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit"
  const val ktorClientCore = "io.ktor:ktor-client-core"
  const val ktorClientEncoding = "io.ktor:ktor-client-encoding"
  const val ktorClientGson = "io.ktor:ktor-client-gson"
  const val ktorClientJsonFeature = "io.ktor:ktor-client-json"
  const val ktorClientLogging = "io.ktor:ktor-client-logging"
  const val ktorClientOkHttp = "io.ktor:ktor-client-okhttp"
  const val ktorClientSerialization = "io.ktor:ktor-client-serialization"
  const val ktorMockEngine = "io.ktor:ktor-client-mock"
  const val leakCanary = "com.squareup.leakcanary:leakcanary-android"
  const val logbackAndroid = "com.github.tony19:logback-android"
  const val lottie = "com.airbnb.android:lottie"
  const val loupe = "com.igreenwood.loupe:loupe"
  const val loupeExtension = "com.igreenwood.loupe:extensions"
  const val materialComponents = "com.google.android.material:material"
  const val mockWebServer = "com.squareup.okhttp3:mockwebserver"
  const val mockk = "io.mockk:mockk"
  const val mpAndroidChart = "com.github.PhilJay:MPAndroidChart"
  const val okHttp3 = "com.squareup.okhttp3:okhttp"
  const val okHttp3LoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
  const val oneSignal = "com.onesignal:OneSignal"
  const val processPhoenix = "com.jakewharton:process-phoenix"
  const val robolectric = "org.robolectric:robolectric"
  const val shimmer = "com.facebook.shimmer:shimmer"
  const val slf4jApi = "org.slf4j:slf4j-api"
  const val slf4jSimple = "org.slf4j:slf4j-simple"
  const val truth = "com.google.truth:truth"
  const val turbine = "app.cash.turbine:turbine"
  const val viewbindingpropertydelegate =
    "com.kirich1409.viewbindingpropertydelegate:vbpd-noreflection"
  const val baseRecyclerViewAdapterHelper = "com.github.CymChad:BaseRecyclerViewAdapterHelper"
  const val composeShimmer = "com.valentinilk.shimmer:compose-shimmer"
  const val uuid = "com.benasher44:uuid"
  const val timber = "com.jakewharton.timber:timber"
  const val palette = "androidx.palette:palette"
}
