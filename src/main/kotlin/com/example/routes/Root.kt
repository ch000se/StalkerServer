package com.example.routes

import io.ktor.http.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.root() {
    get("/") {
        call.respond(
            message = "Welcome to S.T.A.L.K.E.R. Mutants API",
            status = HttpStatusCode.OK
        )
    }
}