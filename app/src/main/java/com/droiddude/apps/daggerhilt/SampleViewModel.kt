package com.droiddude.apps.daggerhilt

import androidx.lifecycle.ViewModel
import com.droiddude.apps.daggerhilt.domain.SampleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SampleViewModel @Inject constructor(
    private val repository : Lazy<SampleRepository>
) : ViewModel() {

    init {
        //repository.value
    }
}