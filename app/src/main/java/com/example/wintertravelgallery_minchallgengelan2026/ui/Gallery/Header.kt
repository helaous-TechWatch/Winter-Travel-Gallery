package com.example.wintertravelgallery_minchallgengelan2026.ui.Gallery

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.wintertravelgallery_minchallgengelan2026.R
import com.example.wintertravelgallery_minchallgengelan2026.ui.theme.WinterTravelGalleryMinChallgengeLan2026Theme

@Composable
fun GalleryHeader(
    title: String,
    modifier: Modifier = Modifier
) {
    Text(
        text = title.uppercase(),
        fontSize = 25.sp,
        maxLines = 3,
        overflow = TextOverflow.Ellipsis,
        style = MaterialTheme.typography.titleLarge,
        modifier = modifier
            .fillMaxWidth()
            .padding(start = 20.dp, top = 40.dp, bottom = 10.dp),
    )
}

@Preview(showBackground = true)
@Composable
fun GalleryHeaderPreview() {
    WinterTravelGalleryMinChallgengeLan2026Theme {
        GalleryHeader(stringResource(R.string.header_title))
    }
}