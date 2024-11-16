package ru.tbank.education.school.lesson8.dao

import org.springframework.stereotype.Component
import ru.tbank.education.school.lesson8.dto.User

@Component
class UserRepository {
    private val users = mutableListOf<User>()
    fun getByUserName(userName: String): User? =
            users.find { it.userName == userName }

    fun addUser(user: User): User {
        users.add(user)
        return user
    }
}