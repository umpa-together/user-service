package com.umpa.user.domain.user

import com.umpa.user.storage.UserEntity
import java.time.LocalDateTime

data class User(
    val id: Long,
    val createdAt: LocalDateTime?,
    val updatedAt: LocalDateTime?,
    val email: String,
    val password: String,
    val name: String,
    val realName: String,
    val introduction: String,
    val profileImage: String,
    val backgroundImage: String,
    val noticeToken: String,
    val accessedAt: LocalDateTime,
    val active: Boolean
) {
    constructor(entity: UserEntity) : this(
        id = entity.id,
        createdAt = entity.createdAt,
        updatedAt = entity.updatedAt,
        email = entity.email,
        password = entity.password,
        name = entity.name,
        realName = entity.realName,
        introduction = entity.introduction,
        profileImage = entity.profileImage,
        backgroundImage = entity.backgroundImage,
        noticeToken = entity.noticeToken,
        accessedAt = entity.accessedAt,
        active = entity.active
    )
}
