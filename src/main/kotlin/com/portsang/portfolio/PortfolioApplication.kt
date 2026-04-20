package com.portsang.portfolio

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class PortfolioApplication

fun main(args: Array<String>) {
    runApplication<PortfolioApplication>(*args)
}
