package com.example.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.PrdCategory;

@Repository
public interface PrdCategoryRepository extends CrudRepository<PrdCategory, Integer> {

}
