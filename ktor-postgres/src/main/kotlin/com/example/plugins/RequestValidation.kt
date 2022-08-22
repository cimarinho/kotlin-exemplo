package com.example.plugins

import com.example.configuration.validate.RecipeValidation
import io.ktor.server.application.*
import io.ktor.server.plugins.requestvalidation.*

fun Application.configureValidation() {
    install(RequestValidation) {
        validate<RecipeValidation> { recipeValidation ->
            recipeValidation.validate(recipeValidation)
        }
    }
}



