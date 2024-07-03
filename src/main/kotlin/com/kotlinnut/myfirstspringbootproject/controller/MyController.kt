package com.kotlinnut.myfirstspringbootproject.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController {
    // http://localhost:8080/hello
    // http://localhost:8080/hello?nickname=zhangsan&phone=123
    @RequestMapping(value = ["/hello"], method = [RequestMethod.GET])
    fun hello(nickname:String, phone:String): String {
        println(phone)
        return "hello $nickname！"
    } 
}