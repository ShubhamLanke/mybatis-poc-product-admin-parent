package com.dss.api.filter;

import lombok.Data;

import java.util.List;

@Data
public class ProductFilter {
    private List<Long> productIds;
    private List<String> productNames;
    private Boolean isAvailable;
    private Boolean joinCategory;
}
