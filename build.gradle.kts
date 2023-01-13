// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.application) version Version.application apply false
    id(Plugins.library) version Version.application apply false
    id (Plugins.kotlinAndroid) version "1.7.20" apply false

    // Hilt
    id(Plugins.hilt) version Version.hilt apply false
}