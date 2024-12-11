package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, _ ->
            call.respondText("Page not found", status = HttpStatusCode.NotFound)
        }

        status(HttpStatusCode.BadRequest) { call, _ ->
            call.respondText("Bad Request", status = HttpStatusCode.BadRequest)
        }

        exception<Throwable> { call, cause ->
            call.respondText("Internal server error: ${cause.message}", status = HttpStatusCode.InternalServerError)
        }

        exception<Exception> { call, cause ->
            call.respondText("Unexpected error: ${cause.message}", status = HttpStatusCode.InternalServerError)
        }
    }
}
