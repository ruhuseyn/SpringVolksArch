package com.company.volksdevSpring.model

import org.hibernate.annotations.GenericGenerator
import java.math.BigDecimal
import java.time.LocalDateTime
import java.util.Date
import javax.persistence.*
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.spi.PersistenceUnitTransactionType

@Entity
data class Transaction(
        @Id
        @GeneratedValue(generator = "UUID")
        @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
        val id:String?,
        val transactionType: TransactionType? = TransactionType.INITIAL,
        val ammount: BigDecimal?,
        val transactionDate: LocalDateTime?,


        @ManyToOne(fetch = FetchType.LAZY, optional = false, cascade = [CascadeType.ALL])
        @JoinColumn(name = "account_id", nullable = false)
        val account:Account
)

enum class TransactionType{
    INITIAL,TRANSFER


}
