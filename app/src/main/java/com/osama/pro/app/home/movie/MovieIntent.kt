package com.osama.pro.app.home.movie

sealed class MovieIntent {
    object FetchMovie : MovieIntent()
    object SearchMovie : MovieIntent()
}