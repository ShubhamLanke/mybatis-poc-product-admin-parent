package com.dss.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    private Long id;

    private String name;

    private Double price;

    private Boolean available;

    private LocalDate createdAt;

    private Long categoryId;

}