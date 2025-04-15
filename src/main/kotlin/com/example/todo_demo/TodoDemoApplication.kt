package com.example.todo_demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TodoDemoApplication

fun main(args: Array<String>) {
	runApplication<TodoDemoApplication>(*args)
}
