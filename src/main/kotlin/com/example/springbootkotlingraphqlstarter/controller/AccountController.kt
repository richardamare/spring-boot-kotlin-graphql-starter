package com.example.springbootkotlingraphqlstarter.controller

import com.example.springbootkotlingraphqlstarter.model.Account
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class AccountController {
    @QueryMapping
    fun accounts(): List<Account> = listOf()
}