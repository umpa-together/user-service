package com.umpa.user.storage

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long> {
    fun findOneByEmail(email: String): UserEntity?

    fun existsByName(name: String): Boolean
}
