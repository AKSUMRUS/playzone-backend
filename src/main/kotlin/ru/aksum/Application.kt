package ru.aksum

import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.cio.*
import ru.aksum.features.login.configureLoginRouting
import ru.aksum.features.register.configureRegisterRouting
import ru.aksum.plugins.*

fun main() {
    embeddedServer(CIO, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureRouting()
    configureLoginRouting()
    configureRegisterRouting()
    configureSerialization()
}
