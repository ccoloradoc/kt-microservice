package com.colorado.kotlin.app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication


@SpringBootApplication
open class SimpleMicroserviceApp

fun main(args: Array<String>) {
    runApplication<SimpleMicroserviceApp>(*args)
}