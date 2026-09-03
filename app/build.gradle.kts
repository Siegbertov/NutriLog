plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.ksp)
    alias(libs.plugins.hilt)
}

android {
    namespace = "com.s1g1.nutrilog"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }

    defaultConfig {
        applicationId = "com.s1g1.nutrilog"
        minSdk = 24
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    /*   ROOM (DATABASE)   */
    implementation(libs.androidx.room.runtime)
    implementation(libs.androidx.room.ktx)
    ksp(libs.androidx.room.compiler)
    /*   RETROFIT   */
    implementation(libs.retrofit)
    implementation(libs.converter.gson)
    /*   DAGGER-HILT   */
    implementation(libs.hilt.android)
    ksp(libs.hilt.compiler)
    /*   COROUTINES   */
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.kotlinx.coroutines.android)
    /*   SCOPES   */
    implementation(libs.androidx.lifecycle.viewmodel.ktx) // (viewModelScope)
    implementation(libs.androidx.lifecycle.runtime.ktx) // (lifecycleScope)
    /*   FRAGMENT NAVIGATION   */
    implementation(libs.androidx.navigation.fragment.ktx)
    implementation(libs.androidx.navigation.ui.ktx)

    implementation(libs.androidx.fragment.ktx) // Fragment
    implementation(libs.androidx.recyclerview) // RecycleView
    implementation(libs.androidx.cardview) // CardView

    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}