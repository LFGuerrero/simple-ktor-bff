package com.example.routes

import io.ktor.server.application.call
import io.ktor.server.response.respond
import io.ktor.server.routing.Route
import io.ktor.server.routing.get
import io.ktor.server.routing.route
import kotlinx.serialization.Serializable

@Serializable
class User(val id: Int, val name: String, val email: String)

fun Route.userRoutes() {
    route("/api/users") {
        get {
            val users = listOf(
                User(1, "João Silva", "joao@email.com"),
                User(2, "Maria Santos", "maria@email.com"),
                User(3, "Pedro Costa", "pedro@email.com")
            )
            call.respond(users)
        }

        get("/{id}") {
            val id = call.parameters["id"]?.toIntOrNull()
            if (id != null) {
                val user = User(id, "Usuário $id", "user$id@email.com")
                call.respond(user)
            } else {
                call.respond(io.ktor.http.HttpStatusCode.BadRequest, "ID inválido")
            }
        }
    }
}

fun Route.productRoutes() {
    route("/api/products") {
        get {
            val products = listOf(
                mapOf("id" to 1, "name" to "Notebook", "price" to 3500.00),
                mapOf("id" to 2, "name" to "Mouse", "price" to 50.00),
                mapOf("id" to 3, "name" to "Teclado", "price" to 150.00)
            )
            call.respond(products)
        }
    }
}