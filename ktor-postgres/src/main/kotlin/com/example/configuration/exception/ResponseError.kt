package com.example.configuration.exception


data class ErrorMap(val errorMap: List<ResponseError>)

data class ResponseError(val id: String, val message: String)