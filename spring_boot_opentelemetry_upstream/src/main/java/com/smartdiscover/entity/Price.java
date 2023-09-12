package com.smartdiscover.entity;

import lombok.Data;

@Data
public class Price {

    private long productId;
    private double priceAmount;
    private double discount;

}
