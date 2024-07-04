package com.example.redisevents

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RedisEventsApplication

fun main(args: Array<String>) {
    runApplication<RedisEventsApplication>(*args)
}
