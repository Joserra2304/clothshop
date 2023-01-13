package com.svalero.clothshop.service;

import com.svalero.clothshop.domain.Client;
import com.svalero.clothshop.domain.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll();
    Product findById(long id);

    Product addProduct(Product product);

    void deleteProduct(long id);

    Product updateProduct(long id, Product updateProduct);
    Product updateProductStock(long id, boolean updateStock);

    List<Product> findByAvailable(boolean availability);


}