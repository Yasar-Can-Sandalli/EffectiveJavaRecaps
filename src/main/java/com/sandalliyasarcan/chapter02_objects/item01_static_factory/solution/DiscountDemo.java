package com.sandalliyasarcan.chapter02_objects.item01_static_factory.solution;

import java.math.BigDecimal;

public class DiscountDemo {
    public static void main(String[] args) {

        //Sepet Tutarimiz 1000 Tl olsun tabi kurus kismi 0 yani 1000.00
        BigDecimal price = new BigDecimal("1000.00");


        Discount studentDiscount = Discount.percentage(BigDecimal.valueOf(15)); // %15 indirim cuponu olusturduk (ogrencilere ozel :> )


        Discount coupon = Discount.fixedAmount(new BigDecimal("50.00")); // 50 TL indirim kuponu olusturuduk olsuturduk



        System.out.println(Discount.none() == Discount.none()); //Ayni nesne olgunu fark edin , calistirinca true yazacak buyuk ihtimalle


        // Avantaj 3 ve 4: Çağıran kod hangi sınıfın döndüğünü bilmek zorunda değildir !!!
        Discount gold = Discount.forTier(CustomerTier.GOLD);
        System.out.println(gold.apply(price));
        System.out.println(gold.getClass().getSimpleName()); //gold nesnesinin  uretildigi class in adini vericek



        System.out.println(studentDiscount.apply(price));
        System.out.println(coupon.apply(price));
        System.out.println(Discount.none().apply(price));

        System.out.println(BigDecimal.valueOf(10.00).equals(BigDecimal.valueOf(10.0)));



    }
}

