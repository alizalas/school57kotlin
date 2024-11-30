package demo.application.client

import demo.application.dto.User
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component
import kotlin.random.Random

@Component
@Profile("dev")
class SyntheticUserGenerator: UserGetter {
    override fun getUserById(userId: String): User = User(
        name = "test",
        age = 0,
        sex = Random.nextInt(),
        income = Random.nextLong(),
        loans = listOf()
    )
}