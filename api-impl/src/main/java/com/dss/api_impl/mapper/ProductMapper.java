package com.dss.api_impl.mapper;

import com.dss.api.dto.ProductDTO;
import com.dss.api.filter.ProductFilter;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    List<ProductDTO> findAll(ProductFilter productFilter);
}
