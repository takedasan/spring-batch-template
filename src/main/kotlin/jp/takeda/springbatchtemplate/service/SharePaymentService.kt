package jp.takeda.springbatchtemplate.service

import jp.takeda.springbatchtemplate.dao.ConsumeDao
import jp.takeda.springbatchtemplate.dto.PaymentDto
import jp.takeda.springbatchtemplate.entity.SharePaymentEntity
import org.springframework.stereotype.Service

@Service
class SharePaymentService(
    private val consumeDao: ConsumeDao
) {
    fun calcSharePayment(): List<PaymentDto> {
        val fixedList = consumeDao.selectShareConsume()
        return fixedList.map { SharePaymentEntity(it).toPayment() }.toList()
    }
}
