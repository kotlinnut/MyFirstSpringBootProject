package com.kotlinnut.myfirstspringbootproject.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {
    @GetMapping("/hello")
    fun hello(): String {
        return "hello world！"
    } 
}