package com.umpa.user

import com.umpa.user.domain.user.User
import com.umpa.user.storage.UserEntity
import java.time.LocalDateTime

const val EMAIL = "email"
const val PASSWORD = "password"
const val NAME = "name"
const val REAL_NAME = "realName"
const val INTRODUCTION = "introduction"
const val PROFILE_IMAGE = "profileImage"
const val BACKGROUND_IMAGE = "backgroundImage"
const val NOTICE_TOKEN = "noticeToken"
const val ACTIVE = true

fun createUser(
    email: String = EMAIL,
    password: String = PASSWORD,
    name: String = NAME,
    realName: String = REAL_NAME,
    introduction: String = INTRODUCTION,
    profileImage: String = PROFILE_IMAGE,
    backgroundImage: String = BACKGROUND_IMAGE,
    noticeToken: String = NOTICE_TOKEN,
    accessedAt: LocalDateTime = LocalDateTime.now(),
    active: Boolean = ACTIVE
): User {
    return User(
        UserEntity(
            email = email,
            password = password,
            name = name,
            realName = realName,
            introduction = introduction,
            profileImage = profileImage,
            backgroundImage = backgroundImage,
            noticeToken = noticeToken,
            accessedAt = accessedAt,
            active = active
        )
    )
}
