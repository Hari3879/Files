package com.ojas.springboot.service;

import java.util.List;

import com.ojas.springboot.model.Product;

public interface ProductService {
 public boolean saveProduct(Product product);
 public List<Product> getAllProducts();
 public Product getProductById(int pid);
 public boolean updateProduct(Product product);
 public boolean deleteProduct(int pid);
}
