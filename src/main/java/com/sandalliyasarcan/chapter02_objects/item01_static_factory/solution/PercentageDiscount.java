package com.sandalliyasarcan.chapter02_objects.item01_static_factory.solution;

import java.math.BigDecimal;
import java.math.RoundingMode;

//Bu class yuzdelik indirimi yapan class
final class PercentageDiscount implements Discount {

    private static final BigDecimal HUNDRED = BigDecimal.valueOf(100);

    private final BigDecimal percent;

    PercentageDiscount(BigDecimal percent) {
        this.percent = percent;
    }

    @Override
    public BigDecimal apply(BigDecimal price) {
        BigDecimal reduction = price.multiply(percent).divide(HUNDRED, 2, RoundingMode.HALF_UP);
        return price.subtract(reduction);
    }
}
