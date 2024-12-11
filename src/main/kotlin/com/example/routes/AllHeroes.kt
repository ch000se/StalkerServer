    package com.example.routes

    import io.ktor.server.application.*
    import com.example.models.ApiResponse
    import com.example.repository.HeroRepository
    import io.ktor.http.*
    import io.ktor.server.response.*
    import io.ktor.server.routing.*
    import org.koin.ktor.ext.inject
    import io.ktor.server.plugins.*

    fun Route.getAllHeroes() {
        val heroRepository: HeroRepository by application.inject()

        route("/stalker/heroes") {
            get {
                try {
                    val page = call.request.queryParameters["page"]?.toInt() ?: 1

                    if (page !in 1..5) {
                        throw BadRequestException("Некоректний номер сторінки")
                    }
                    val apiResponse = heroRepository.getAllHeroes(page = page)

                    call.respond(
                        message = apiResponse,
                        status = HttpStatusCode.OK
                    )
                } catch (e: BadRequestException) {
                    call.respond(
                        message = ApiResponse(success = false, message = "Некоректний номер сторінки"),
                        status = HttpStatusCode.BadRequest
                    )
                } catch (e: NumberFormatException) {
                    call.respond(
                        message = ApiResponse(success = false, message = "Некоректний формат номера сторінки"),
                        status = HttpStatusCode.BadRequest
                    )
                } catch (e: Exception) {
                    call.respond(
                        message = ApiResponse(success = false, message = "Непередбачена помилка"),
                        status = HttpStatusCode.InternalServerError
                    )
                }
            }
        }
    }
