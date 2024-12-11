package com.example

import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.JsonNull.content
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {

    @Test
    fun accessRootEndpoint_AssertCorrectInformation() = testApplication {
        application {
            module()
        }
    }
}
