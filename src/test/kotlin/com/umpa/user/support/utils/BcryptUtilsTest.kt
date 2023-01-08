package com.umpa.user.support.utils

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BcryptUtilsTest {
    @Test
    fun `encrypt 테스트`() {
        val plainText = "test"
        val encrypted = BcryptUtils.encrypt(plainText)
        println(encrypted)
    }

    @Test
    fun `isMatch 테스트`() {
        val plainText = "test"
        val encrypted = "\$2a\$10\$zsB8wEIky2EfrZqwYxdffudcP8fSAYPsi6lt0N2i9WhlYXoMnrCxy"
        val isMatch = BcryptUtils.isPasswordMatch(plainText, encrypted)
        assertThat(isMatch).isEqualTo(true)
    }
}
