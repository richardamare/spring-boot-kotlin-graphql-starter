package com.example.springbootkotlingraphqlstarter.model

import java.util.*
import javax.persistence.*

@Entity(name = "account")
class Account {
    @Id
    @Column(name = "id", nullable = false)
    var id: String? = UUID.randomUUID().toString()

    @Column(name = "email", nullable = false)
    var email: String? = null

    @Column(name = "password_digest", nullable = false)
    var passwordDigest: String? = null

    @Enumerated(EnumType.STRING)
    @Column(name = "account_type", nullable = false)
    var accountType: AccountType? = null
}