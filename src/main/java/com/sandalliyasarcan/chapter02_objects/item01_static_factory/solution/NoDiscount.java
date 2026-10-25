package com.sandalliyasarcan.chapter02_objects.item01_static_factory.solution;

import java.math.BigDecimal;

final class NoDiscount implements Discount{

    static final NoDiscount INSTANCE = new NoDiscount();


    //Disaridan hic kimsa 2. baska bir nesne olurturamaz bu sayade
    private NoDiscount(){

    }


    @Override
    public BigDecimal apply(BigDecimal price) {
        return price;
    }
}
