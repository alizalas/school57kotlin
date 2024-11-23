package demo.application.controller

import org.springframework.stereotype.Component
import kotlin.system.measureNanoTime
import kotlin.time.measureTime

@Component
open class Client {
    open fun call(){
        // Вызываем внешний сервис
        Thread.sleep(1000)
    }
}

class ClientProxy: Client() {
    override fun call() {
        val duration = measureTime { super.call() }
    }
}