package jp.takeda.springbatchtemplate

import jp.takeda.springbatchtemplate.usecase.PaymentUseCase
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBatchTemplateApplication(
    private val paymentUseCase: PaymentUseCase
) {
    fun exec() {
        LOGGER.info("--start--")
        paymentUseCase.execUseCase()
    }

    companion object {
        private var LOGGER: Logger = LoggerFactory.getLogger(SpringBatchTemplateApplication::class.java)
    }
}

fun main(args: Array<String>) {
    runApplication<SpringBatchTemplateApplication>(*args).use {
        it.getBean(SpringBatchTemplateApplication::class.java).exec()
        SpringApplication.exit(it)
    }
}
