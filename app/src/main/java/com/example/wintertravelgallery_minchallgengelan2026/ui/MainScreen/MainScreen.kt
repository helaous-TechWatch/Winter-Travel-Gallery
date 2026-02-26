package com.example.wintertravelgallery_minchallgengelan2026.ui.MainScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wintertravelgallery_minchallgengelan2026.Data.Destination
import com.example.wintertravelgallery_minchallgengelan2026.R
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme

@Composable
fun MainScreen(
    innerPadding: PaddingValues,
    onDestinationClick: (Destination) -> Unit
) {
    Column(
        Modifier
            .fillMaxSize()
            .padding(innerPadding)
    ) {
        // Display the header
        MainHeader(title = stringResource(R.string.header_title))
        // Display the grid of destinations
        DisplayDestination(
            modifier = Modifier.fillMaxSize(),
            onDestinationClick = onDestinationClick
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        val paddingValues = PaddingValues(0.dp)
        MainScreen(paddingValues, onDestinationClick = {})
    }
}