package Tut6_ContextMenu

import androidx.compose.foundation.ContextMenuArea
import androidx.compose.foundation.ContextMenuItem
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.singleWindowApplication


/**
 * Context menu for an arbitrary area
 * There is a possibility to create a context menu for an arbitrary application window area. This is implemented using ContextMenuArea API that is similar to ContextMenuDataProvider.
 */

fun main() = singleWindowApplication(title = "Context menu") {
    ContextMenuArea(items = {
        listOf(
            ContextMenuItem("User-defined Action") {/*do something here*/},
            ContextMenuItem("Another user-defined action") {/*do something else*/}
        )
    }) {
        Box(modifier = Modifier.background(Color.Blue).height(100.dp).width(100.dp))
    }
}