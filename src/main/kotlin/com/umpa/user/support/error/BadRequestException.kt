package com.umpa.user.support.error

data class BadRequestException(
    val errorType: ErrorType = DefaultErrorTypeType.BAD_REQUEST
) : RuntimeException(errorType.message)
