package Tut6_ContextMenu

import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.singleWindowApplication

/**
 * Default context menu
 * There is out-of-the box context menu support for TextField and Selectable text.
 *
 * To enable standard context menu for a TextField you just need to put it inside DesktopMaterialTheme:
 */

fun main() = singleWindowApplication(title = "Context menu") {
    val text = remember { mutableStateOf("Hello!") }
    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text(text = "Input") }
    )
}


// Para singleWindowApplication

/*

import androidx.compose.foundation.text.selection.SelectionContainer

fun main() = singleWindowApplication(title = "Context menu") {
    SelectionContainer {
        Text("Hello World!")
    }
}

*/