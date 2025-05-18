package com.example.todo_demo

import com.example.todo_demo.handler.Handler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.router
import reactor.core.publisher.Mono

@Configuration
class Router (private val handler: Handler) {

    @Bean
    fun hello() = router {
        accept(MediaType.APPLICATION_JSON).nest {
            GET("/ping", {ServerResponse.ok().body(Mono.just("pong"), String::class.java)})
        }
    }
}