package com.kotlin.crudexample.repository

import com.kotlin.crudexample.model.Product
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Repository

@Repository
@EnableJpaRepositories
interface ProductRepository : JpaRepository<Product, Long>
