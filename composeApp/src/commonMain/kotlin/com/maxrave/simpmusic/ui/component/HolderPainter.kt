package com.maxrave.simpmusic.ui.component

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import com.maxrave.simpmusic.ui.theme.LocalForceDarkText
import com.maxrave.simpmusic.ui.theme.LocalIsDarkTheme
import org.jetbrains.compose.resources.painterResource
import simpmusic.composeapp.generated.resources.Res
import simpmusic.composeapp.generated.resources.dhun_placeholder
import simpmusic.composeapp.generated.resources.holder
import simpmusic.composeapp.generated.resources.holder_light
import simpmusic.composeapp.generated.resources.holder_video
import simpmusic.composeapp.generated.resources.holder_video_light
import simpmusic.composeapp.generated.resources.round_library_music_24

/**
 * Theme-aware artwork placeholder.
 *
 * Immersive screens (Artist/Album/Playlist/LocalPlaylist/NowPlaying) mark their subtree with
 * [LocalForceDarkText] = true because they always sit on dark artwork; there the dark holder art is
 * kept. Everywhere else the placeholder follows the app theme, using the light variant in light mode
 * so it blends into the white page instead of showing a dark tile.
 */
@Composable
fun rememberHolderPainter(isVideo: Boolean = false): Painter {
    return painterResource(Res.drawable.dhun_placeholder)
}
