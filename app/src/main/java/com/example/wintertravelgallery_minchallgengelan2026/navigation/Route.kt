package com.example.wintertravelgallery_minchallgengelan2026.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed interface Route : NavKey {
    @Serializable
    data object Gallery : NavKey, Route

    @Serializable
    data class GalleryDetail(val imageUrls: List<String>) : NavKey, Route
}
