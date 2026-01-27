package com.example.wintertravelgallery_minchallgengelan2026.ui.Card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.wintertravelgallery_minchallgengelan2026.R
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme

@Composable
fun TravelCard(
    destination: String,
    imageUrls: List<String>,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val coverImage = imageUrls.firstOrNull()

    Box(
        modifier = modifier
            .height(220.dp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() }
    ) {

        // 🖼️ Image de fond
        AsyncImage(
            model = coverImage,
            placeholder = painterResource(R.drawable.placholder_image),
            error = painterResource(R.drawable.placholder_image),
            contentDescription = "Images from $destination",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        // 🌫️ Dégradé pour lisibilité du texte (optionnel mais pro)
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color.Transparent,
                            Color.Black.copy(alpha = 0.6f)
                        ),
                        startY = 300f
                    )
                )
        )

        // 📝 Texte en bas à gauche
        Text(
            text = destination,
            color = Color.White,
            style = MaterialTheme.typography.titleMedium,
            maxLines = 3,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
                .fillMaxWidth(0.8f)
        )

        // ➡️ Flèche en bas à droite
        Image(
            painter = painterResource(R.drawable.round_arrow_forward),
            contentDescription = "Go",
            modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(16.dp)
                .size(20.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun TravelCardPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        val imageUrls = listOf<String>(
            "https://images.unsplash.com/photo-1519904981063-b0cf448d479e?w=600&q=80",
            "https://images.unsplash.com/photo-1551632811-561732d1e306?w=600&q=80",
            "https://images.unsplash.com/photo-1486870591958-9b9d0d1dda99?w=600&q=80",
            "https://images.unsplash.com/photo-1544735716-392fe2489ffa?w=600&q=80",
            "https://images.unsplash.com/photo-1605540436563-5bca99ae766?w=600&q=80"
        )
        TravelCard("une tres long pays sui n'existe pas pour tester un long texte comme blablalboufgfdglkfdkjgdlkfmgdfdgùp", imageUrls, onClick = { })
    }
}