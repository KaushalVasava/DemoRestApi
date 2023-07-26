package com.kaushalvasava.apis.demoapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ApiResponse {
    @Serializable
    @SerialName("success")
    data class Success(val data: List<User>) : ApiResponse()

    @Serializable
    @SerialName("error")
    data class Error(val errorMsg: String) : ApiResponse()
}
