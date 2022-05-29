package com.codegym.baitap1.service;

import com.codegym.baitap1.model.Product;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    Product save(T t);
    void remove(Long id);
}
