package ru.tbank.education.school.lesson8.controller;

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class CalculatorController {
    @RequestMapping("/calculate", method = [RequestMethod.GET])
    fun calculate(@RequestParam("num1") num1: Int, @RequestParam("num2") num2: Int): Int {
        return num1 + num2
    }
}