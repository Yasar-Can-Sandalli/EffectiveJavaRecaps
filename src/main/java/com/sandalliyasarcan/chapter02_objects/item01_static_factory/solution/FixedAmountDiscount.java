package com.sandalliyasarcan.chapter02_objects.item01_static_factory.solution;

import java.math.BigDecimal;

final class FixedAmountDiscount implements Discount {


    private final BigDecimal amount;


    FixedAmountDiscount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public BigDecimal apply(BigDecimal price) {
        return price.subtract(amount).max(BigDecimal.ZERO);
    }
}
