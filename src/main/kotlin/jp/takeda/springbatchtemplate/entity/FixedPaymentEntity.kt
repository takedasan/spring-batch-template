package jp.takeda.springbatchtemplate.entity

import jp.takeda.springbatchtemplate.dto.ConsumeDto
import jp.takeda.springbatchtemplate.dto.PaymentDto
import jp.takeda.springbatchtemplate.entity.master.SupplierPaymentTerm
import java.math.BigDecimal
import java.math.RoundingMode

data class FixedPaymentEntity(
    val consume: ConsumeDto
) {
    fun toPayment() = PaymentDto(
        itemId = consume.itemId,
        supplier = consume.supplier,
        paymentAmount = paymentAmount
    )

    private val paymentAmount: BigDecimal
        get() = fixedAmount.multiply(BigDecimal(consume.buy)).setScale(0, RoundingMode.FLOOR)

    private val fixedAmount: BigDecimal
        get() = SupplierPaymentTerm.find(consume.supplier).fixedAmount
}
