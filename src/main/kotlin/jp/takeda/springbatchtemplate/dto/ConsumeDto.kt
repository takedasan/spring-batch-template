package jp.takeda.springbatchtemplate.dto

import java.math.BigDecimal

data class ConsumeDto(
    val itemId: String,
    val supplier: String,
    // Fixed, Share
    val paymentType: String,
    val retailPrice: BigDecimal,
    val buy: Int
)
