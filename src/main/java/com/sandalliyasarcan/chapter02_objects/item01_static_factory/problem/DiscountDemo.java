package com.sandalliyasarcan.chapter02_objects.item01_static_factory.problem;

import java.math.BigDecimal;

public class DiscountDemo {
    public static void main(String[] args) {

        Discount d1 = new Discount(BigDecimal.valueOf(15), true); // 15% mi yoksa 15Tl mi

        Discount d2 = new Discount(BigDecimal.valueOf(10), false); //true false ne demekti

        Discount noDiscount = new Discount(BigDecimal.ZERO, false); // Her çağrıda YENİ nesne


        BigDecimal price = new BigDecimal("1000.00");

        Discount d3 = new Discount(new BigDecimal("15"), true);
        Discount d4 = new Discount(new BigDecimal("50"), false);
        Discount noDiscount2 = new Discount(BigDecimal.ZERO, false);

        System.out.println("d1 (%15)   : " + d1.apply(price));
        System.out.println("d2 (50 TL) : " + d2.apply(price));
        System.out.println("İndirimsiz : " + noDiscount.apply(price));

        // 🐞 Gerçek hayatta olan hata: geliştirici true yerine false yazdı.
        // Kod DERLENİR, ÇALIŞIR, ama müşteriye yanlış fiyat çıkar.
        Discount buggy = new Discount(new BigDecimal("15"), false);
        System.out.println("Hatalı     : " + buggy.apply(price));

        // Avantaj 2'nin yokluğu: "indirim yok" için her seferinde yeni nesne
        Discount anotherNoDiscount = new Discount(BigDecimal.ZERO, false);
        System.out.println("Aynı nesne mi? " + (noDiscount == anotherNoDiscount));


    /*
        1 - Constructor’ın adı yoktur. Adı her zaman sınıfın adıdır.	new Discount(15, true) ne yaptığını anlatmaz. Aynı parametre tiplerine sahip iki constructor tanımlanamaz.
        2 -	new her zaman yeni nesne oluşturur.	“İndirim yok” durumu için binlerce özdeş nesne üretilir. Önbellek (cache) kullanmak imkânsızdır.
        3 -	Sadece kendi sınıfının nesnesini döndürür.	Yüzde ve sabit indirim aynı sınıfa tıkıldı ve if (percentage) dalları her metoda yayıldı.
        4 -	Girdiye göre farklı bir sınıf seçemez.	“Gold müşteriye %10, Platinum’a %20” gibi bir kuralı merkezi bir yerde tutamazsın.


        //Cozum Ne Peki : Static factory method, bir sınıfın nesnesini döndüren static bir metottur. Aslında bunu her gün kullanıyorsun:





        Integer.valueOf(127);   // Seviye testi Soru 1'deki cache'in kaynağı buydu!
        List.of("a", "b");
        LocalDate.of(2026, 10, 25);
        Optional.empty();
        gibi......

        Simdi bu problemi cozen pattern e ulasmak icin solution paketine gidin.

    */

    }
}
