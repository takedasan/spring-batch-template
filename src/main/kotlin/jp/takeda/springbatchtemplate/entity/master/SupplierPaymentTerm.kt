package jp.takeda.springbatchtemplate.entity.master

import java.math.BigDecimal

enum class SupplierPaymentTerm(
    val supplier: String,
    val fixedAmount: BigDecimal,
    val shareRate: BigDecimal
) {
    TAKEDA_MUSIC("takedaミュージック", BigDecimal(100.0), BigDecimal(0.5)),
    TAKEDA_RECORDS("takedaレコーズ", BigDecimal(800.0), BigDecimal(0.9)),
    TAKEDA_ENTERTAINMENT("takedaエンタテイメント", BigDecimal(200.0), BigDecimal(0.5)),
    ;

    companion object {
        fun find(supplier: String) = SupplierPaymentTerm.values().find { it.supplier == supplier }
            ?: throw IllegalArgumentException("ないです: $supplier")
    }
}
