package io.reviro.authimpl

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ServiceApplication {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            runApplication<ServiceApplication>(*args)
        }
    }
}
