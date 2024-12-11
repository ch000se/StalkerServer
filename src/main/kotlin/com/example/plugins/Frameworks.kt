package com.example.plugins

import com.example.di.koinModule
import io.ktor.server.application.*
import org.koin.ktor.plugin.Koin

fun Application.configureFrameworks() {
    install(Koin) {
        modules(koinModule)
    }
}
