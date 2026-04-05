package com.portsang.portfolio.presentation.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PresentationApiController {

    @GetMapping("/test")
    @RequestMapping(method = [RequestMethod.GET], name = "/test")
    fun test(): String {
        return "OK"
    }

}