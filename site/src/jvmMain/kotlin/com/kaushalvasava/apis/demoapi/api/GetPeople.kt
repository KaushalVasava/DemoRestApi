package com.kaushalvasava.apis.demoapi.api

import com.kaushalvasava.apis.demoapi.models.ApiResponse
import com.kaushalvasava.apis.demoapi.models.User
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val people = listOf(
    User("Kaushal", 26),
    User("Jigar", 28),
    User("Sachin", 23),
    User("Kashish", 18)
)

@Api
suspend fun getPeople(context: ApiContext) {
    try {
        val number = context.req.params.getValue("count").toInt()
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Success(people.take(number))
            )
        )
    } catch (e: Exception) {
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Error(e.message.toString())
            )
        )
    }
}