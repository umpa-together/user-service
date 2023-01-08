package com.umpa.user.storage

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "users")
class UserEntity(
    @Column(name = "email")
    val email: String,

    @Column(name = "password")
    val password: String,

    @Column(name = "name")
    val name: String = "",

    @Column(name = "real_name")
    val realName: String,

    @Column(name = "introduction")
    val introduction: String,

    @Column(name = "profile_image")
    val profileImage: String,

    @Column(name = "background_image")
    val backgroundImage: String,

    @Column(name = "notice_token")
    val noticeToken: String,

    @Column(name = "accessed_ts")
    val accessedAt: LocalDateTime,

    @Column(name = "active")
    val active: Boolean = true
) : BaseEntity()
