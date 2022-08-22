package com.example.plugins

import com.example.presenter.RecipeRequest
import com.example.presenter.RecipeTypesRequest
import com.example.presenter.createRecipe
import io.ktor.server.application.*
import io.ktor.server.locations.*
import io.ktor.server.plugins.requestvalidation.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    install(Locations) {
    }

    routing {
       route("/recipe/account/{accountId}"){
           createRecipe()
       }
    }



}
