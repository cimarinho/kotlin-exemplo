package com.example.configuration.validate

import io.ktor.server.plugins.requestvalidation.*

interface RecipeValidation {
    suspend fun validate(validation: RecipeValidation): ValidationResult
}