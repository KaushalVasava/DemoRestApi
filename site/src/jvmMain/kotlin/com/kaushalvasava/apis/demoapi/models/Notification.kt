package com.kaushalvasava.apis.demoapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Notification(
    val id: String,
    val image: String,
    val title: String,
    val timeDate: Long,
    val actionBy: String
)
