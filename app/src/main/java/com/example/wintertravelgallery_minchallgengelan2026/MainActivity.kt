package com.example.wintertravelgallery_minchallgengelan2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wintertravelgallery_minchallgengelan2026.Data.Destination
import com.example.wintertravelgallery_minchallgengelan2026.ui.TravelCard
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WinterTravelGalleryMinChallgengeLan2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DisplayDestination(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun DisplayDestination(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // 2 colonnes
        modifier = modifier.padding(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(Destination.entries.toTypedArray()) { destination ->
            TravelCard(
                destination = destination.title,
                imageUrls = destination.imageUrls,
                onClick = { /* navigation */ },
                modifier = Modifier
                    .fillMaxWidth()
                    .aspectRatio(1f) // cartes carrées
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayDestinationPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        DisplayDestination()
    }
}