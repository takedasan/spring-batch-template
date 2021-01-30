package jp.takeda.springbatchtemplate.dto

import java.math.BigDecimal

data class PaymentDto(
    val itemId: String,
    val supplier: String,
    val paymentAmount: BigDecimal
)
