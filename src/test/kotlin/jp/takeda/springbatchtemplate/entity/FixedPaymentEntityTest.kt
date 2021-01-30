package jp.takeda.springbatchtemplate.entity

import jp.takeda.springbatchtemplate.dto.ConsumeDto
import jp.takeda.springbatchtemplate.dto.PaymentDto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.math.BigDecimal

class FixedPaymentEntityTest {
    private val consume = ConsumeDto(
        itemId = "item1",
        supplier = "takedaミュージック",
        paymentType = "Fixed",
        buy = 5,
        retailPrice = BigDecimal(300.0)
    )

    private val payment = PaymentDto(
        itemId = "item1",
        supplier = "takedaミュージック",
        paymentAmount = BigDecimal(500.0)
    )

    @Test
    fun Payment変換ができること() {
        val result = FixedPaymentEntity(consume).toPayment()
        assertEquals(result, payment)
    }
}
