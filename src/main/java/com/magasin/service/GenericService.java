package com.magasin.service;

import java.util.List;

public interface GenericService<T> {

    public List<T> findAll();
    public T findById(Long id);
    public T save(T entity);
    public T update(T entity);
    public void delete(Long id);
}