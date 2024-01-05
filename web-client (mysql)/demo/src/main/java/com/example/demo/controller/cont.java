package com.example.demo.controller;

import com.swagger.client.codegen.rest.api.ProductControllerApi;
import com.swagger.client.codegen.rest.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class cont {

    @Autowired
    private ProductControllerApi productControllerApi;

    @GetMapping("/test")
    public String index() {
        return "welcome to spring boot rest web services";
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable long id) {
        return productControllerApi.getProductByIdUsingGET(id);
    }

    @GetMapping("/fetch")  // Update the path here
    public List<Product> getProducts() {
        return productControllerApi.getAllProductsUsingGET();
    }

    @PostMapping("create")
    public Product creatProduct(@RequestBody Product product) {
        return productControllerApi.saveProductUsingPOST(product);
    }

    @PutMapping("/update/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productControllerApi.updateProductUsingPUT(id, product);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productControllerApi.deleteProductUsingDELETE(id);
    }
}