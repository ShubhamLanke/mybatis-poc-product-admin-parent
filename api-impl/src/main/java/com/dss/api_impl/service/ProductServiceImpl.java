package com.dss.api_impl.service;

import com.dss.api.dto.ProductDTO;
import com.dss.api.filter.ProductFilter;
import com.dss.api.model.Product;
import com.dss.api.service.ProductService;
import com.dss.api_impl.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    @Autowired
    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> getAll(ProductFilter productFilter) {
        return productMapper.findAll(productFilter);
    }
}
