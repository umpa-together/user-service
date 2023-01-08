package com.umpa.user.support.error

import org.springframework.http.HttpStatus

enum class CommonErrorTypeType(
    override val message: String,
    override val statusCode: HttpStatus
) : ErrorType {

    NOT_FOUND_EMAIL_USER("해당 email의 유저를 찾을 수 없습니다.", HttpStatus.BAD_REQUEST),
    FORBIDDEN_PASSWORD_USER("입력하신 password는 일치하지 않습니다.", HttpStatus.FORBIDDEN)
}
