package com.example.wintertravelgallery_minchallgengelan2026.ui.Gallery

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wintertravelgallery_minchallgengelan2026.R
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.bgMain

@Composable
fun GalleryScreen(innerPadding: PaddingValues) {
    val headerText = stringResource(R.string.header_title)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(color = bgMain)
    ) {
        GalleryHeader(title = headerText)
        DisplayDestination(
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryScreenPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        val paddingValues = PaddingValues(0.dp)
        GalleryScreen(paddingValues)
    }
}