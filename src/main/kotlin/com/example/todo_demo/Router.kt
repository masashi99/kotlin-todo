package com.example.todo_demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router
import com.example.todo_demo.handler.Handler

@Configuration
class Router (private val handler: Handler) {

    @Bean
    fun hello() = router {
        accept(MediaType.APPLICATION_JSON).nest {
            GET("/", handler::getJson)
        }
    }
}