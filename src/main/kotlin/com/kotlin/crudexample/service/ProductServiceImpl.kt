package com.kotlin.crudexample.service

import com.kotlin.crudexample.model.Product
import com.kotlin.crudexample.repository.ProductRepository
import org.springframework.stereotype.Service

@Service
class ProductServiceImpl(val productRepository: ProductRepository) : ProductService {

    override fun getAll(): List<Product> = productRepository.findAll()

    override fun getById(id: Long): Product = productRepository.getById(id)

    override fun create(product: Product): Product = productRepository.save(product)

    override fun update(product: Product): String {
        if (!productRepository.existsById(product.id))
            return "Produto não existe na base de dados"

        productRepository.save(product)

        return "Produto id ${product.id} alterado com sucesso"
    }

    override fun delete(id: Long): String {
        if (!productRepository.existsById(id))
            return "Produto não existe na base de dados"

        productRepository.deleteById(id)

        return "Produto removido com sucesso!"
    }
}
