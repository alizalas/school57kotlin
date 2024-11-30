package demo.application.service

import demo.application.client.CrmClient
import demo.application.client.UserGetter

class CalculationService(
        val userGetter: UserGetter,
        val pdnService: PdnService,
) {
    fun calculate(userId: String, monthlyPayment: Long): Long {
        val user = userGetter.getUserById(userId)
        return
    }
}