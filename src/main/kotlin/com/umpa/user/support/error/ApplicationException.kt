package com.umpa.user.support.error

data class ApplicationException(
    val errorType: ErrorType = DefaultErrorTypeType.INTERNAL_SERVER_ERROR
) : RuntimeException(errorType.message)
