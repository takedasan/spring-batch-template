package jp.takeda.springbatchtemplate.entity

import jp.takeda.springbatchtemplate.dto.ConsumeDto
import jp.takeda.springbatchtemplate.dto.PaymentDto
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class SharePaymentEntityTest {
    private val consume = ConsumeDto(
        itemId = "item1",
        supplier = "takedaレコーズ",
        paymentType = "Share",
        buy = 10,
        retailPrice = BigDecimal(400.0)
    )

    private val payment = PaymentDto(
        itemId = "item1",
        supplier = "takedaレコーズ",
        paymentAmount = BigDecimal(3600.0)
    )

    @Test
    fun Payment変換ができること() {
        val result = SharePaymentEntity(consume).toPayment()
        Assertions.assertEquals(result, payment)
    }
}
