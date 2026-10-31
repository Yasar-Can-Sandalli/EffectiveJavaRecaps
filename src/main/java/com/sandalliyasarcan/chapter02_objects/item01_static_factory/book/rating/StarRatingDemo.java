package com.sandalliyasarcan.chapter02_objects.item01_static_factory.book.rating;


import java.util.List;

public class StarRatingDemo {

    public static void main(String[] args) {

        StarRating star1 = StarRating.of(1);
        System.out.println(star1);

        StarRating star2 = StarRating.of(2);
        System.out.println(star2);

        StarRating star3 = StarRating.of(3);
        System.out.println(star3);

        StarRating star4 = StarRating.of(4);
        System.out.println(star4);

        StarRating star5 = StarRating.of(5);
        System.out.println(star5 + " " + star5.stars());

        StarRating demoStar = StarRating.of(1);
        System.out.println("of(1) == of(1) : " + (star1 == demoStar));
        System.out.println("of(1) == of(2) : " + (star1 == star2));


        try {
            StarRating star0 = StarRating.of(0);
            System.out.println(star0);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        try {
            StarRating star6 = StarRating.of(6);
            System.out.println(star6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


        List<StarRating> reviews = List.of(StarRating.of(5), StarRating.of(4), StarRating.of(4), StarRating.of(4));
        int total = 0;

        for (StarRating review : reviews) {
            total += review.stars();
        }

        double average = total / (double) reviews.size();
        System.out.println("Average: " + average);


    }


}
