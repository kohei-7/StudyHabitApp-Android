
plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.sha.studyhabitapplication"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.sha.studyhabitapplication"
        minSdk = 26
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildToolsVersion = "33.0.1"

}

dependencies {

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    //Material Design 3 library
    implementation ("androidx.compose.material3:material3:1.1.2")
    androidTestImplementation("org.junit.jupiter:junit-jupiter:5.8.1")
    //
    //FragmentScenario for testing fragment
//    val fragmentVersion = "1.6.2"
//    debugImplementation("androidx.fragment:fragment-testing:$fragmentVersion")
//    implementation("com.android.support.test.espresso:espresso-intents:3.0.2")
    //
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}