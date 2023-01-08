package com.umpa.user.domain.user

import com.umpa.user.support.error.ApplicationException
import com.umpa.user.support.error.CommonErrorTypeType
import com.umpa.user.support.utils.BcryptUtils
import org.springframework.stereotype.Component

@Component
class UserValidator {
    fun validatePassword(plainText: String, hashValue: String) {
        if (!BcryptUtils.isPasswordMatch(plainText, hashValue))
            throw ApplicationException(CommonErrorTypeType.FORBIDDEN_PASSWORD_USER)
    }
}
