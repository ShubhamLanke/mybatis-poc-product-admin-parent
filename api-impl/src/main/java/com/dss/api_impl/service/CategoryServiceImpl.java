package com.dss.api_impl.service;

import com.dss.api.dto.ProductDTO;
import com.dss.api.service.CategoryService;
import com.dss.api_impl.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CategoryServiceImpl implements CategoryService {

    private final CategoryMapper categoryMapper;

    @Autowired
    public CategoryServiceImpl(CategoryMapper categoryMapper) {
        this.categoryMapper = categoryMapper;
    }

    @Override
    public List<ProductDTO> getAllProductsByCategory(Long id) {
        return categoryMapper.getAllProductsByCategory(id);
    }
}
