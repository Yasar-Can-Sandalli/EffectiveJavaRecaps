package com.sandalliyasarcan.chapter02_objects.item01_static_factory.book.rating;

/**
 * 1-5 arası ürün puanı.
 * Bu sınıfın yalnızca 5 nesnesi vardır (instance-controlled).
 */
public final class StarRating {

    private static final int MAX_STARS = 5;
    private static final StarRating[] CACHE = new StarRating[MAX_STARS];

    private final int stars;



    static {
        for (int i = 0; i < MAX_STARS; i++) {
            CACHE[i] = new StarRating(i + 1);
        }
    }


    private StarRating(int stars) {
        this.stars = stars;
    }


    public static StarRating of(int stars){
        if (stars < 1 || stars > MAX_STARS) {
            throw new IllegalArgumentException("Stars must be between 1 and " + MAX_STARS + ": " + stars);
        }
        return CACHE[stars - 1];
    }

    /** Puan değerini döndürür (1 ile MAX_STARS arasında). */
    public int stars() {
         return stars;
    }



    @Override
    public String toString() {
        return "★".repeat(stars) + "☆".repeat(MAX_STARS - stars);
    }
}