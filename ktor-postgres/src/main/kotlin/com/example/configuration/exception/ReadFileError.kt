package com.example.configuration.exception

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.fasterxml.jackson.module.kotlin.readValue

class ReadFileError {
    fun load(): ErrorMap {
        val mapper = ObjectMapper(YAMLFactory())
        mapper.findAndRegisterModules()
        val jsonString: String = this::class.java.classLoader.getResource("validation.yaml")?.readText() ?: ""
        return mapper.readValue(jsonString)
    }
}