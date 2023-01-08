package com.umpa.user.domain.user

import com.umpa.user.storage.UserRepository
import com.umpa.user.support.error.BadRequestException
import com.umpa.user.support.error.CommonErrorTypeType
import org.springframework.stereotype.Component

@Component
class UserReader(
    private val userRepository: UserRepository
) {
    fun findOneByEmail(email: String): User {
        return userRepository.findOneByEmail(email)?.let { User(it) }
            ?: throw BadRequestException(CommonErrorTypeType.NOT_FOUND_EMAIL_USER)
    }

    fun existsByName(name: String): Boolean {
        return userRepository.existsByName(name)
    }
}
