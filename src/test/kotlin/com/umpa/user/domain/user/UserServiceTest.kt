package com.umpa.user.domain.user

import com.umpa.user.createUser
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.mockk

internal class UserServiceTest : BehaviorSpec({
    val userReader = mockk<UserReader>(relaxed = true)
    val userValidator = mockk<UserValidator>()
    val sut = UserService(userReader, userValidator)

//    Given("email, password가 주어졌을 때") {
//        val email = "email"
//        val password = "password"
//        val token = "valid-token"
//
//        every { userReader.findOneByEmail(any()) } returns createUser(email, password)
//        every { userValidator.validatePassword(any(), any()) } just Runs
//        every { sut.signIn(any(), any()) } returns token
//
//        When("로그인을 하게 되면") {
//            val actual = sut.signIn(email, password)
//            Then("token이 반환된다.") {
//                actual shouldBe token
//            }
//        }
//    }

    Given("name이 주어졌을 때") {

        every { userReader.existsByName(any()) } returns true
        every { sut.isUserExistsByName(any()) } returns true

        When("해당 유저를 조회하면") {
            val actual = sut.isUserExistsByName("name")

            Then("존재하는지 반환한다.") {
                actual shouldBe true
            }
        }
    }
})
