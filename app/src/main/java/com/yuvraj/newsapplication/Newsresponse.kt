package com.yuvraj.newsapplication

data class Newsresponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)