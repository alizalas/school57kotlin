package ru.tbank.education.school.lesson7

import java.time.Duration
import java.time.LocalDate


/**
 * Текущий баланс по вкладу, отображающийся в личном кабинете с учетом всех начислений.
 */
fun currentBalance(deposit: Deposit) = deposit.initialDeposit + (
    1 + (
            deposit.`сложная процентная ставка`.let {
                if (deposit.isVip) {
                    it + 1
                } else {
                    it
                }
            } / 100
            ) / 365
    ).po(deposit.createAt.toEpochDay() - LocalDate.now().toEpochDay())
