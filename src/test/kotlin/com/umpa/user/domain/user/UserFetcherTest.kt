package com.umpa.user.domain.user

import com.umpa.user.storage.UserRepository
import com.umpa.user.support.error.BadRequestException
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.BehaviorSpec
import io.mockk.every
import io.mockk.mockk

internal class UserFetcherTest : BehaviorSpec({
    val repository = mockk<UserRepository>()
    val sut = UserReader(repository)

    Given("해당하는 email의 user가 없을 때") {

        every { repository.findOneByEmail(any()) } throws BadRequestException()

        When("user를 조회하게 되면") {
            Then("예외가 발생한다.") {
                shouldThrow<BadRequestException> {
                    sut.findOneByEmail("invalid-email")
                }
            }
        }
    }
})
