package jp.takeda.springbatchtemplate.usecase

import jp.takeda.springbatchtemplate.dao.PaymentDao
import jp.takeda.springbatchtemplate.service.FixedPaymentService
import jp.takeda.springbatchtemplate.service.SharePaymentService
import org.springframework.stereotype.Service

@Service
class PaymentUseCase(
    private val fixedPaymentService: FixedPaymentService,
    private val sharePaymentService: SharePaymentService,
    private val paymentDao: PaymentDao
) {
    fun execUseCase() {
        val fixedList = fixedPaymentService.calcFixedPayment()
        val shareList = sharePaymentService.calcSharePayment()

        paymentDao.insert(fixedList + shareList)
    }
}
