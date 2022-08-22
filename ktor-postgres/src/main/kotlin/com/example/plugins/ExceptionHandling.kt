package com.example.plugins

import com.example.configuration.exception.ResponseError
import com.example.function.errorMap
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.requestvalidation.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.exceptionHandling() {

    install(StatusPages) {
        exception<Throwable> { call, cause ->
            cause.printStackTrace()
            call.respond(status = HttpStatusCode.BadRequest, ResponseError("ERROR", "Error"))
        }

        exception<RequestValidationException> { call, cause ->
            val map = cause.reasons.map { errorMap().get(it) }
            call.respond(HttpStatusCode.BadRequest, map)
        }

    }
}
