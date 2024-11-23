package demo.application.controller
import org.springframework.stereotype.Component
@Component
class LogicService {
    fun simpleScore(creditApplication: CreditApplication): Boolean {
        // Нельзя выдавать кредит клиентам не достигшим 18 лет
        if (creditApplication.user.age <  18 ) {
            return false
        }
        // Если суммарный месячный платеж составляет больше трети дохода то нельзя выдавать новый кредит
        val existLoan = creditApplication.user.loans.filterNot {
            it.isClose
        }
        val existPayment = existLoan.sumOf { it.monthlyPayment } + creditApplication.monthlyPayment < creditApplication.user.income / 3
        return true
    }
}