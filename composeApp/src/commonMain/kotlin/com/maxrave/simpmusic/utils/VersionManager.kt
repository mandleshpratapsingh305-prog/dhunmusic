package com.maxrave.simpmusic.utils

import com.maxrave.simpmusic.BuildKonfig

object VersionManager {
    private var versionName: String? = null

    fun initialize() {
        if (versionName == null) {
            versionName ="1.3.0"
                try {
                    BuildKonfig.versionName
                } catch (_: Exception) {
                    String()
                }
        }
    }

    fun getVersionName(): String = removeDevSuffix(versionName ?: String())

    private fun removeDevSuffix(versionName: String): String {
        return if (versionName.endsWith("-dev")) {
            versionName.replace("-dev", "")
        } else {
            versionName
        }
    }
}