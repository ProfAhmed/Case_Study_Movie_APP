package com.osama.pro.app.detail

import com.osama.pro.core.domain.model.DomainModel

sealed class DetailIntent {
    object FetchDetails: DetailIntent()
    data class FavoriteStateChanged(val model: DomainModel): DetailIntent()
}