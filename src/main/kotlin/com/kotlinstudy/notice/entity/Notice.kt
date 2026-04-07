package com.kotlinstudy.notice.entity

import com.kotlinstudy.common.entity.BaseEntity
import jakarta.persistence.*

@Entity
@Table(name = "notice")
class Notice(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0L,

    @Column(nullable = false)
    var title: String,

    @Column(nullable = false, columnDefinition = "TEXT")
    var content: String,

    @Column(nullable = false)
    var author: String
) : BaseEntity() {
}