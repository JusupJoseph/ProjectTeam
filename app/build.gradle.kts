plugins {
    id (Plugins.application)
    id (Plugins.kotlinAndroid)

    // Kapt
    kotlin(Plugins.kapt)

    // Hilt
    id(Plugins.hilt)
}

android {
    namespace = Config.applicationId
    compileSdk = Config.compileAndTargetSdk

    defaultConfig {
        applicationId = Config.applicationId
        minSdk = Config.minSdk
        targetSdk = Config.compileAndTargetSdk
        versionCode = Config.versionCode
        versionName = Config.versionName

        testInstrumentationRunner = Config.testInstrumentationRunner
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles (getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    // ViewBinding
    buildFeatures.viewBinding = true
}

dependencies {
// Core
    implementation(Dependencies.Core.core)

    // AppCompat
    implementation(Dependencies.UIComponents.appCompat)

    // Material
    implementation(Dependencies.UIComponents.material)

    // ConstraintLayout
    implementation(Dependencies.UIComponents.constraint)

    // NavComponents
    implementation(Dependencies.NavComponents.navigationFragment)
    implementation(Dependencies.NavComponents.navigationUI)

    // Coroutines
    implementation(Dependencies.Coroutines.coroutinesAndroid)
    implementation (Dependencies.Coroutines.coroutinesCore)

    // ViewBindingPropertyDelegate
    implementation(Dependencies.ViewBindingPropertyDelegate.viewBindingDelegate)

    // Retrofit
    implementation(Dependencies.Retrofit.retrofit)
    implementation(Dependencies.Retrofit.gsonConverter)

    // OkHttp
    // define a BOM and its version
    implementation(platform(Dependencies.OkHttp.okHttpPlatform))

    // define any required OkHttp artifacts without version
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.okHttpLoggingInterceptor)

    // Hilt
    implementation(Dependencies.DaggerHilt.hilt)
    kapt(Dependencies.DaggerHilt.hiltCompiler)

    // Lifecycle
    implementation(Dependencies.Lifecycle.lifecycleViewModel)
    implementation(Dependencies.Lifecycle.lifecycleRunTime)

    // LiveData
    implementation(Dependencies.Lifecycle.lifecycleLiveData)

    // Glide
    implementation(Dependencies.Glide.glide)
    annotationProcessor(Dependencies.Glide.glideCompiler)

    //Coil
    implementation("io.coil-kt:coil:2.2.2")
}