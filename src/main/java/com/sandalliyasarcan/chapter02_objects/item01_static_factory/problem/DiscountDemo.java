package com.sandalliyasarcan.chapter02_objects.item01_static_factory.problem;

import java.math.BigDecimal;

public class DiscountDemo {
    public static void main(String[] args) {

        Discount d1 = new Discount(BigDecimal.valueOf(15), true); // 15% mi yoksa 15Tl mi

        Discount d2 = new Discount(BigDecimal.valueOf(10), false); //true false ne demekti

        Discount noDiscount = new Discount(BigDecimal.ZERO, false); // Her çağrıda YENİ nesne

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
