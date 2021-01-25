package jp.takeda.springbatchtemplate

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBatchTemplateApplication {
    fun hoge() {
        LOGGER.info("hogehoge")
    }

    companion object {
        var LOGGER: Logger = LoggerFactory.getLogger(SpringBatchTemplateApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringBatchTemplateApplication>(*args).use {
        it.getBean(SpringBatchTemplateApplication::class.java).hoge()
        SpringApplication.exit(it)
    }
}
