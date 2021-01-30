package jp.takeda.springbatchtemplate.entity

import jp.takeda.springbatchtemplate.dto.ConsumeDto
import jp.takeda.springbatchtemplate.dto.PaymentDto
import jp.takeda.springbatchtemplate.entity.master.SupplierPaymentTerm
import java.math.BigDecimal
import java.math.RoundingMode

data class SharePaymentEntity(
    private val consume: ConsumeDto
) {
    fun toPayment() = PaymentDto(
        itemId = consume.itemId,
        supplier = consume.supplier,
        paymentAmount = paymentAmount
    )

    private val paymentAmount: BigDecimal
        get() = consume.retailPrice.multiply(BigDecimal(consume.buy)).multiply(shareRate).setScale(0, RoundingMode.FLOOR)

    private val shareRate: BigDecimal
        get() = SupplierPaymentTerm.find(consume.supplier).shareRate
}
