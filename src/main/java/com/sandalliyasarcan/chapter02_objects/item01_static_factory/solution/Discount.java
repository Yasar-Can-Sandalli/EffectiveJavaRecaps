package com.sandalliyasarcan.chapter02_objects.item01_static_factory.solution;

import java.math.BigDecimal;
import java.util.Objects;

/**
    Ön Bilgi: Interface içinde static metot yazilabiliyor. Java 8'den beri interface’ler static metot içerebilir.
    Bu, static factory’yi doğrudan interface’in üzerine koyabileceğimiz anlamına gelir.
    List.of() tam olarak böyle çalışır: List bir interface’tir ve of() onun static metodudur.
    @author Yasar Can Sandalli
*/

public interface Discount {





/*
    Bir fiyata uygulanabilen indirim.
    Nesneler yalnızca static factory metotları üzerinden oluşturulur.
*/


    BigDecimal apply(BigDecimal price);


    //avantaj1 : isim tasir , ne yaptigini anlatir bu arkadas bize
     static Discount percentage(BigDecimal percent){ //artik adinda anlasildigi uzere bu yuzdelik indirimi yapan metodur olucak

        Objects.requireNonNull(percent, "Percatage null olamaz");

        if (percent.compareTo(BigDecimal.ZERO) < 0 || percent.compareTo(BigDecimal.valueOf(100)) > 0){
            throw new IllegalArgumentException("Yüzde 0-100 arasında olmalı: " + percent);
        }


        return new PercentageDiscount(percent);

    }

    //Avantaj 1: Aynı parametre tipiyle ama farklı isimle ikinci bir "kurucu"
    static Discount fixedAmount(BigDecimal amount){
        Objects.requireNonNull(amount, "amount null olamaz");

        if (amount.signum() < 0){
            throw new IllegalArgumentException("amount negatif olamaz");
        }

        return new FixedAmountDiscount(amount);


    }

    //Avantaj 2: Her çağrıda ayni nesne döner
    static Discount none(){
        return NoDiscount.INSTANCE;
    }


    static Discount forTier(CustomerTier tier){
        return switch (tier){
            case STANDARD -> none();
            case GOLD -> percentage(BigDecimal.valueOf(10.00));
            case PLATINUM -> percentage(BigDecimal.valueOf(20.00));
        };
    }


}
