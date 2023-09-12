package com.smartdiscover.entity;

import lombok.Data;

@Data
public class Product {

    private long id;
    private String name;
    private Price price;

}
