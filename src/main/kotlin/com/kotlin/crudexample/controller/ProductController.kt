package com.kotlin.crudexample.controller

import com.kotlin.crudexample.model.Product
import com.kotlin.crudexample.service.ProductService
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiResponse
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(val productService: ProductService) {

    @GetMapping("/products")
    fun getAll(): List<Product> = productService.getAll()

    @GetMapping("/product/{id}")
    @ApiOperation(value = "Get Product by Id", response = Product::class)
    fun getById(@PathVariable(value = "id") id: Long): Product = productService.getById(id)

    @PutMapping("/product")
    fun update(@RequestBody product: Product) = productService.update(product)

    @PostMapping("/product")
    fun create(@RequestBody product: Product) = productService.create(product)

    @DeleteMapping("/product/{id}")
    fun delete(@PathVariable(value = "id") id: Long) = productService.delete(id)
}
