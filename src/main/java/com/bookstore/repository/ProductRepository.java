package com.bookstore.repository;

import com.bookstore.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository  extends CrudRepository<Product,Long> {
}
