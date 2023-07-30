package com.kaushalvasava.apis.demoapi.api

import com.kaushalvasava.apis.demoapi.data.DataUtil
import com.kaushalvasava.apis.demoapi.data.DataUtil.getUser
import com.kaushalvasava.apis.demoapi.models.ApiResponse
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Api(routeOverride = "notifications")
suspend fun getNotifications(context: ApiContext) {
    try {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.SuccessNotification(DataUtil.getNotifications())
            )
        )
    } catch (e: Exception) {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Failed(e.message.toString())
            )
        )
    }
}