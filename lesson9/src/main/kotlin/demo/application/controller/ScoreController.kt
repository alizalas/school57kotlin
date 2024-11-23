package demo.application.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime
import kotlin.system.measureNanoTime


@RestController
class ScoreController(
    val client: Client
) {
    @GetMapping("/score")
    fun score1() {
//        val timeStart = System.currentTimeMillis()
//        client.call()
//        val timeFinish = System.currentTimeMillis()
//        val duration = timeFinish - timeStart
//        println(duration)
//        val duration = measureNanoTime { client.call() }
//        println(duration)
        return
    }

    @PostMapping("/score2")
    fun score2() {
//        val timeStart = System.currentTimeMillis()
//        client.call()
//        val timeFinish = System.currentTimeMillis()
//        val duration = timeFinish - timeStart
//        println(duration)
        val duration = measureNanoTime { client.call() }
        println(duration)
    }

}

//fun main(){
//    ScoreController().simpleScore()
//}
data class User(
    val age: Int,
    val name: String,
    val sex: Int,
    val income: Long,
    val loans: List<Loan>,
) {

    data class Loan(
        val creteAt: LocalDateTime,
        val isClose: Boolean,
        val monthlyPayment: Long,
    )
}

data class CreditApplication(
    val createdAt: LocalDateTime,
    val totalAmount: Long,
    val monthlyPayment: Long,
    val user: User,
    )