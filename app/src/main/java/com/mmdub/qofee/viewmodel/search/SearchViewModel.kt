package com.mmdub.qofee.viewmodel.search

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mmdub.qofee.data.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {
    val searchState = mutableStateOf("")
}