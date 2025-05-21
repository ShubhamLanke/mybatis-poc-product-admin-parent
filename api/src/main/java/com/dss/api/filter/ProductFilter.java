package com.dss.api.filter;

import lombok.Data;

@Data
public class ProductFilter {
    private String name;
    private Boolean categoryPresent;
}
