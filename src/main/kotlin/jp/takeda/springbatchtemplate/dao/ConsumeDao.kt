package jp.takeda.springbatchtemplate.dao

import jp.takeda.springbatchtemplate.dto.ConsumeDto
import org.springframework.stereotype.Component
import java.math.BigDecimal

@Component
class ConsumeDao {
    fun selectFixedConsume() = listOf(
        ConsumeDto(
            itemId = "item1",
            supplier = "takedaミュージック",
            paymentType = "Fixed",
            buy = 5,
            retailPrice = BigDecimal(300.0)
        ),
        ConsumeDto(
            itemId = "item2",
            supplier = "takedaレコーズ",
            paymentType = "Fixed",
            buy = 3,
            retailPrice = BigDecimal(250.0)
        )
    )

    fun selectShareConsume() = listOf(
        ConsumeDto(
            itemId = "item3",
            supplier = "takedaレコーズ",
            paymentType = "Share",
            buy = 10,
            retailPrice = BigDecimal(400.0)
        ),
        ConsumeDto(
            itemId = "item4",
            supplier = "takedaエンタテイメント",
            paymentType = "Share",
            buy = 5,
            retailPrice = BigDecimal(500.0)
        )
    )
}
