package com.Josh;

/**
 * Created by Destro on 3/28/2016.
 */
public class Painting {

    String title;
    String artist;

    double height;
    double width;

    public Painting(String title, String artist, double height, double width) {
        this.title = title;
        this.artist = artist;
        this.height = height;
        this.width = width;
    }

    public double calculateShippingCost() {
        if (height + width > 100) {
            return 4.00;
        } else {
            return 2.50;

        }
    }
}
