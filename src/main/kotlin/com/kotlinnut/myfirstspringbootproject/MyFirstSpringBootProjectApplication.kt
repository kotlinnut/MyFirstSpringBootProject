package com.kotlinnut.myfirstspringbootproject

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyFirstSpringBootProjectApplication

fun main(args: Array<String>) {
	runApplication<MyFirstSpringBootProjectApplication>(*args)
}
