package com.example.domain.models

data class PhoneDetails (
    val Brand: String,
    val Phone_name: String,
    val Thumbnail: String,
    val Phone_images: List<String>,
    val Release_date: String,
    val Dimension: String,
    val Os: String,
    val Storage: String,
    val Specifications: List<Specifications>,
)