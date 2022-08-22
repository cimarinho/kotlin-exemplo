package com.example.presenter

import com.example.configuration.validate.RecipeValidation
import io.ktor.server.plugins.requestvalidation.*

data class RecipeRequest(val name: String, val timePrepare: String, val type: RecipeTypesRequest) : RecipeValidation {
    override suspend fun validate(validation: RecipeValidation): ValidationResult {
        if (validation is RecipeRequest) {
            val errors = mutableListOf<String>()
            when (validation.name) {
                "" -> errors.add("NAME_IS_BLANK")
                "name" -> errors.add("NAME_IS_INVALID")
            }
            when (validation.timePrepare) {
                "" -> errors.add("TIMEPREPARE_IS_BLANK")
            }
            if (!errors.isEmpty()){
                return ValidationResult.Invalid(errors)
            }
        }
        return ValidationResult.Valid
    }

}