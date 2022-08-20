package com.example.presenter

import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.routing.*

fun Route.createRecipe(){

    post("/recipe"){
        val accountId = call.parameters["accountId"].toString().toLong()
        val recipeRequest = call.receive<RecipeRequest>()
        println("acountid = $accountId e recipeRequest = $recipeRequest")

    }
}