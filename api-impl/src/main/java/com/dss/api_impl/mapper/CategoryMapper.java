package com.dss.api_impl.mapper;

import com.dss.api.dto.ProductDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {

    List<ProductDTO> getAllProductsByCategory(Long id);
}
