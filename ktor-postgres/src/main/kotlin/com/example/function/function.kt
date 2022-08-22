package com.example.function

import com.example.configuration.exception.ReadFileError
import com.example.configuration.exception.ResponseError

fun errorMap(): Map<String, ResponseError> {
    val errorMapper = ReadFileError().load()
    return errorMapper.errorMap.map { it.id to it }.toMap()
}