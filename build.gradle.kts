plugins {
    alias(libs.plugins.android).apply(false)
    id("org.jetbrains.kotlin.android") version "1.7.1" apply false
    alias(libs.plugins.ksp).apply(false)
}
