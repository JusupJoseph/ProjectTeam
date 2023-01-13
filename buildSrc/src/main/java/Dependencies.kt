object Version {
    const val hilt = "2.44"
    const val lifecycle = "2.5.1"
    const val navigation = "2.5.3"
    const val retrofit = "2.9.0"
    const val glide = "4.14.2"
    const val application = "7.3.1"
    const val viewBindingDelegate = "1.4.7"
    const val coroutinesAndroid = "1.6.4"
    const val coroutinesCore = "1.3.9"
}

object Plugins {
    const val application = "com.android.application"
    const val kotlinAndroid = "org.jetbrains.kotlin.android"
    const val kapt = "kapt"
    const val hilt = "com.google.dagger.hilt.android"
    const val saveArgs = "androidx.navigation.safeargs"
    const val library = "com.android.library"
}

object Dependencies {

    object Core {
        const val core = "androidx.core:core-ktx:1.9.0"
    }
    object Coroutines {
        const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.coroutinesAndroid}"
        const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.coroutinesCore}"
    }
    object UIComponents {
        const val appCompat = "androidx.appcompat:appcompat:1.5.1"
        const val material = "com.google.android.material:material:1.7.0"
        const val constraint = "androidx.constraintlayout:constraintlayout:2.1.4"
    }
    object ViewBindingPropertyDelegate {
        const val viewBindingDelegate =
            "com.github.kirich1409:viewbindingpropertydelegate-noreflection:${Version.viewBindingDelegate}"
    }
    object Lifecycle {
        const val lifecycleViewModel =
            "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.lifecycle}"
        const val lifecycleRunTime = "androidx.lifecycle:lifecycle-runtime-ktx:${Version.lifecycle}"
        const val lifecycleLiveData =
            "androidx.lifecycle:lifecycle-livedata-ktx:${Version.lifecycle}"
    }
    object DaggerHilt {
        const val hilt = "com.google.dagger:hilt-android:${Version.hilt}"
        const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Version.hilt}"
    }
    object NavComponents {
        const val navigationFragment =
            "androidx.navigation:navigation-fragment:${Version.navigation}"
        const val navigationUI = "androidx.navigation:navigation-ui:${Version.navigation}"
    }
    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
        const val gsonConverter = "com.squareup.retrofit2:converter-gson:${Version.retrofit}"
    }
    object OkHttp {
        const val okHttpPlatform = "com.squareup.okhttp3:okhttp-bom:4.10.0"
        const val okHttp = "com.squareup.okhttp3:okhttp"
        const val okHttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor"
    }
    object Glide{
        const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
        const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glide}"
    }
}