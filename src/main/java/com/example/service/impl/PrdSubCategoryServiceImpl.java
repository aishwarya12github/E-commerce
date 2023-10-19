package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.PrdSubCategory;
import com.example.repository.PrdSubCategoryRepository;
import com.example.service.PrdSubCategoryService;

@Service
public class PrdSubCategoryServiceImpl implements PrdSubCategoryService{

	@Autowired
	private PrdSubCategoryRepository prdSubCategoryRepository;
	@Override
	public PrdSubCategory savePrdSubCategory(PrdSubCategory prdSubCategory) {
		PrdSubCategory prdSubCategory1=prdSubCategoryRepository.save(prdSubCategory);
		return prdSubCategory1;
	}

}
