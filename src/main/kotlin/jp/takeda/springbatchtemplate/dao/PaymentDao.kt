package jp.takeda.springbatchtemplate.dao

import jp.takeda.springbatchtemplate.dto.PaymentDto
import org.slf4j.LoggerFactory
import org.springframework.stereotype.Component

@Component
class PaymentDao {
    fun insert(paymentList: List<PaymentDto>) {
        paymentList.map {
            LOGGER.info("insert: $it")
        }
    }

    companion object {
        private val LOGGER = LoggerFactory.getLogger(PaymentDao::class.java)
    }
}
