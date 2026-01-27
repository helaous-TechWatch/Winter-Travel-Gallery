package com.example.wintertravelgallery_minchallgengelan2026

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.wintertravelgallery_minchallgengelan2026.ui.MainScreen.MainScreen
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WinterTravelGalleryMinChallgengeLan2026Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainScreen(innerPadding)
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GalleryScreenPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        val paddingValues = PaddingValues(0.dp)
        MainScreen(paddingValues)
    }
}