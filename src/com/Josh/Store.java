package com.Josh;

import java.util.LinkedList;

public class Store {

    public static void main(String[] args) {
	Painting p1 = new Painting("Poppies", "Poppy Painter", 43, 20);
        Painting p2 = new Painting("Epic Ninjua Battle", "Ninja Dave", 65, 100);

        LinkedList<Shippable> itemsToShip = new LinkedList<Shippable>();
        itemsToShip.add(p1);
        itemsToShip.add(p2);

        int mailingListCustomers = 100;
for (int i = 0; i < mailingListCustomers; i++) {
    Sticker testSticker = new Sticker();
    itemsToShip.add(testSticker);
}
}
