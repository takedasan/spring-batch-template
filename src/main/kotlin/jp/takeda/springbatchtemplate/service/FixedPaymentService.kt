package jp.takeda.springbatchtemplate.service

import jp.takeda.springbatchtemplate.dao.ConsumeDao
import jp.takeda.springbatchtemplate.dto.PaymentDto
import jp.takeda.springbatchtemplate.entity.FixedPaymentEntity
import org.springframework.stereotype.Service

@Service
class FixedPaymentService(
    private val consumeDao: ConsumeDao
) {
    fun calcFixedPayment(): List<PaymentDto> {
        val fixedList = consumeDao.selectFixedConsume()
        return fixedList.map { FixedPaymentEntity(it).toPayment() }.toList()
    }
}
