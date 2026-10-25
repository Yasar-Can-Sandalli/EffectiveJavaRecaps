package com.sandalliyasarcan.chapter02_objects.item01_static_factory.problem;

import java.math.BigDecimal;

public class Discount {

    /*
      Bir e ticaret uygulaması yaziyuz diyelim ve sepette indirim uygulanacak  iki tur indirimimiz olucak
      Birincisi % indirimli indirim : %10 gibi
      Ikincisi belirli bir tutar indirimli indirim : 250TL gibi


      Cogu gelistiricinin ilk yazdigi kod suna benzer

     */

    private final BigDecimal value;

    private final boolean percentage;


    public Discount(BigDecimal value, boolean percentage) {
        this.value = value;
        this.percentage = percentage;
    }

//Bu kodlar Metod imzalari ayni oldugu icin derlenemez !!!!
/*
    public Discount (BigDecimal percent){
        return .....
    }
*/

/*
    public Discount (BigDecimal fixedAmount){
        return; ....
    }
*/



    //true ise percentage yuzdelik olarak indirim yapiyor , false ise sabit tutat olarak indirim yapiyor
    //Urun 1000 lira olsun | indirim degeride 15
    public BigDecimal apply(BigDecimal price){
        if (percentage){
            BigDecimal reduction = price.multiply(value).divide(BigDecimal.valueOf(100));
            return price.subtract(reduction);
        }

        return price.subtract(value);


    }





}
