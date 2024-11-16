package ru.tbank.education.school.lesson8.service

import org.jetbrains.annotations.Contract
import org.springframework.stereotype.Component
import ru.tbank.education.school.lesson8.dao.UserRepository
import ru.tbank.education.school.lesson8.dto.User
import kotlin.random.Random

@Component
class UserService (
    private val userRepository: UserRepository
) {
    fun getUser(userName: String) =
        userRepository.getByUserName()

    fun addUser()



}