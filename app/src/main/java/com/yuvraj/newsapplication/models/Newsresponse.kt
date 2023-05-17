package com.yuvraj.newsapplication.models

import com.yuvraj.newsapplication.models.Article

data class Newsresponse(
    val articles: List<Article>,
    val status: String,
    val totalResults: Int
)