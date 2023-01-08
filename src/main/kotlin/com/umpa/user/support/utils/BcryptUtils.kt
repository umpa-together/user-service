package com.umpa.user.support.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class BcryptUtils {
    companion object {
        fun encrypt(message: String): String {
            return BCryptPasswordEncoder(10).encode(message)
        }

        fun isPasswordMatch(plainText: String, hashValue: String): Boolean {
            return BCryptPasswordEncoder(10).matches(plainText, hashValue)
        }
    }
}
