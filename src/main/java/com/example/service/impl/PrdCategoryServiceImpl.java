package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.PrdCategory;
import com.example.repository.PrdCategoryRepository;
import com.example.service.PrdCategoryService;

@Service
public class PrdCategoryServiceImpl implements PrdCategoryService {

	@Autowired
	private PrdCategoryRepository prdCategoryRepository;
	
	@Override
	public PrdCategory savePrdCategory(PrdCategory prdCategory) {
		PrdCategory prdCategory1=prdCategoryRepository.save(prdCategory);
		return prdCategory1;
	}
	
}
