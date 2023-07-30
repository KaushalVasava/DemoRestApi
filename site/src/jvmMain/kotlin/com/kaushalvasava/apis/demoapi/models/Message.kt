package com.kaushalvasava.apis.demoapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val msg: String,
    val timeStamp: Long,
    val isSeen: Boolean = false,
    val userId: String,
)
