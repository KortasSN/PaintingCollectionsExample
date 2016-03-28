package com.Josh;

/**
 * Created by Destro on 3/28/2016.
 */
public class Sticker implements Shippable {
    public double calculateShippingCost() {
        double envelope = 0.07;
        double stamp = 0.38;

        return envelope + stamp;
    }

}
