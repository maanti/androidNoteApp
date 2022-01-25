package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.add_edit_note

import androidx.compose.runtime.mutableStateListOf

data class NoteTagsState(
    val tags: MutableList<String> = mutableStateListOf<String>()
)
