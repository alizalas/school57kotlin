package ru.tbank.education.school.lesson8.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.tbank.education.school.lesson8.service.UserService

@RestController
class UserController (
    private val userService: UserService
) {
    @GetMapping("/users/{username}")
    fun getUserWithUserName(@PathVariable("username") username: String) =
        userService.getUser(username)

    @GetMapping("/users/{username}")
    fun getUserWithUserName(@PathVariable("username") username: String) =
            userService.getUser(username)
}