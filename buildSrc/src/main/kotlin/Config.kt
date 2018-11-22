object Versions {
    val kotlin = "1.3.10"
    val androidPlugin = "3.2.1"
    val androidxCore = "1.0.0"
    val archCore = "2.0.0-beta01"
    val room = "2.0.0-beta01"
    val lifecycle = "2.0.0-beta01"
    val glide = "4.7.1"
    val koin = "1.0.1"
    val junit = "4.12"
    val espresso = "3.1.0-alpha4"
    val mockito = "2.7.19"
    val mockitoAll = "1.10.19"
    val atslRunner = "1.1.0-alpha1"
    val atslRules = "1.1.0-alpha1"
    val mockWebserver = "3.8.1"
    val robolectric = "3.4.2"
    val retrofit = "2.3.0"
    val okLogging = "3.9.0"
    val constraintLayout = "1.1.3"
    val rxJava = "2.2.2"
    val rxAndroid = "2.1.0"
    val bintray = "1.7.3"
    val AAVersion = "4.5.1"
    val androidSupport = "1.0.0"
    val espressoTest = "2.2.2"
}

object BuildPlugins {
    val androidPlugin = "com.android.tools.build:gradle:${Versions.androidPlugin}"
}

object Android {
    val minSdk = 15
    val targetSdk = 28
    val applicationId = "com.example.framgianguyenthanhtungh.workmanager"
    val versionCode = 1
    val versionName = "1.0"
}

object GradlePlugins {
    val android = "com.android.application"
    val kotlin = "kotlin"
    val kotlinAndroid = "android"
    val kotlinExt = "android.extensions"
    val kotlinApt = "kapt"
    val javaLib = "java-library"
    val androidLib = "com.android.library"
}

object Modules {
    val app = ":app"
}

object AndroidJUnit {
    val runner = "android.support.test.runner.AndroidJUnitRunner"
}

object BuildType {
    val debug = "debug"
    val release = "release"

    val minifyRelease = true
    val proguardRelease = "proguard-rules.pro"

    val minifyDebug = false
    val proguardDebug = "proguard-rules.pro"
}

object Libs {
    //Support V4
    val androidSupportV4 = "androidx.legacy:legacy-support-v4:${Versions.androidSupport}"

    //Android support V13
    val androidSupportV13 = "androidx.legacy:legacy-support-v13:${Versions.androidSupport}"

    //Espresso Test
    val espressoTest = "com.android.support.test.espresso:espresso-core:${Versions.espressoTest}"

    //KTX
    val configureKotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    val ktx = "androidx.core:core-ktx:${Versions.androidxCore}"
    val archTesting = "androidx.arch.core:core-testing:${Versions.archCore}"
    val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"

    // Support libs
    val supportAnnotations = "androidx.annotation:annotation:${Versions.androidSupport}"
    val supportAppCompat = "androidx.appcompat:appcompat:${Versions.androidSupport}"
    val supportRecyclerview = "androidx.recyclerview:recyclerview:${Versions.androidSupport}"
    val supportCardview = "androidx.cardview:cardview:${Versions.androidSupport}"
    val supportDesign = "com.google.android.material:material:${Versions.androidSupport}"
    val supportV4 = "androidx.legacy:legacy-support-v4:${Versions.androidSupport}"

    // Constraint Layout
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"

    // databinding compiler
    val bindingCompiler = "androidx.databinding:databinding-compiler:${Versions.androidPlugin}"

    // room database
    val roomRuntime = "androidx.room:room-runtime:${Versions.room}"
    val roomCompiler = "androidx.room:room-compiler:${Versions.room}"
    val roomRxjava2 = "androidx.room:room-rxjava2:${Versions.room}"

    // lifecycle
    val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:${Versions.lifecycle}"
    val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val lifecycleJava8 = "androidx.lifecycle:lifecycle-common-java8:${Versions.lifecycle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecycle}"

    // RxKotlin & RxJava
    val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Versions.rxAndroid}"
    val rxJava = "io.reactivex.rxjava2:rxjava:${Versions.rxJava}"

    // retrofit
    val retrofitRuntime = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitGson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    val retrofitMock = "com.squareup.retrofit2:retrofit-mock:${Versions.retrofit}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val okLogging = "com.squareup.okhttp3:logging-interceptor:${Versions.okLogging}"

    // Glide for image loader
    val glideRuntime = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideCompiler = "com.github.bumptech.glide:compiler:${Versions.glide}"

    // JUnit for testing
    val junit = "junit:junit:${Versions.junit}"

    // KTX testing
    val kotlinTest = "org.jetbrains.kotlin:kotlin-test-junit:${Versions.kotlin}"
    val kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    val kotlinAllopen = "org.jetbrains.kotlin:kotlin-allopen:${Versions.kotlin}"

    // Ruler & Runner testing
    val atslRunner = "androidx.test:runner:$${Versions.atslRunner}"
    val atslRules = "androidx.test:rules:${Versions.atslRules}"

    // espresso for testing
    val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val espressoContrib = "androidx.test.espresso:espresso-contrib:${Versions.espresso}"
    val espressoIntents = "androidx.test.espresso:espresso-intents:${Versions.espresso}"

    // robolectric for testing
    val robolectric = "org.robolectric:robolectric:${Versions.robolectric}"

    // Mockito for testing
    val mockitoCore = "org.mockito:mockito-core:${Versions.mockito}"
    val mockitoAll = "org.mockito:mockito-all:${Versions.mockitoAll}"
    val mockitoWebServer = "com.squareup.okhttp3:mockwebserver:${Versions.mockWebserver}"

    // KOIN
    val koinCore = "org.koin:koin-core:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val koinScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val koinJava = "org.koin:koin-java:${Versions.koin}"
    val koinTest = "org.koin:koin-test:${Versions.koin}"

    // Bintray
    val bintray = "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    // Android Annotation
    val androidAnnotation = "org.androidannotations:androidannotations-api:${Versions.AAVersion}"
    val androidAnnotationProcessor = "org.androidannotations:androidannotations:${Versions.AAVersion}"
}
