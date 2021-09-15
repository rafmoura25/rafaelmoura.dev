package com.kotlin.crudexample.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Product")
data class Product(
    @Id @GeneratedValue val id: Long,
    val name: String,
)