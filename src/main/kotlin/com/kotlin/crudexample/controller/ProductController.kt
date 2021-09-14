package com.kotlin.crudexample.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController {

    @GetMapping("/products")
    fun getAll(): List<String> = listOf("product1", "product2")
}