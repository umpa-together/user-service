package com.umpa.user.domain.user

import org.springframework.stereotype.Service

@Service
class UserService(
    private val userReader: UserReader,
    private val userValidator: UserValidator
) {
    fun signIn(email: String, password: String): String {
        val user = userReader.findOneByEmail(email)
        userValidator.validatePassword(password, user.password)
        return "token"
    }

    fun isUserExistsByName(name: String): Boolean {
        return userReader.existsByName(name)
    }
}
