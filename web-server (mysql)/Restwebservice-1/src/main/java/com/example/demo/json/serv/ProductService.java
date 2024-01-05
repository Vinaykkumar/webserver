// ProductService.java
package com.example.demo.json.serv;

import com.example.demo.json.entit.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product saveProduct(Product product);
    void deleteProduct(Long id);
    Product updateProduct(Long id, Product updatedProduct);
	Product partialUpdateProduct(Long id, Product product);
}
