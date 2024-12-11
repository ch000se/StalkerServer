package com.example.plugins

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.defaultheaders.*

fun Application.configureHTTP() {
    install(DefaultHeaders) {
        val onYearInSeconds = 60 * 60 * 24 * 365
        header(
            name = HttpHeaders.CacheControl,
            value = "public, max-age=$onYearInSeconds, immutable"
        )
    }
}
