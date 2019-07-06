package com.bookstore.controller.repostory;

import com.bookstore.controller.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepostory extends CrudRepository<Product, Integer> {
}
