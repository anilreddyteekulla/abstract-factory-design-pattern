package com.stuffed.animals;

import com.stuffed.animals.animals.StuffedAnimal;
import com.stuffed.animals.stores.StuffedAnimalStore;
import com.stuffed.animals.stores.australia.AustraliaStuffedAnimalStore;
import com.stuffed.animals.stores.us.USStuffedAnimalStore;

public class ClientFactoryTest {

    public static void main(String[] args) {
        System.out.println("Order stuffed animals in the Australia stuffed animals store");
        StuffedAnimalStore auStore = new AustraliaStuffedAnimalStore();
        StuffedAnimal stuffedKoalaAnimal = auStore.orderStuffedAnimal("koala", "plush", "beans", "dark brown");
        System.out.println(stuffedKoalaAnimal);
        StuffedAnimal stuffedKangarooAnimal = auStore.orderStuffedAnimal("kangaroo", "cloth", "wood", "brown");
        System.out.println(stuffedKangarooAnimal);

        System.out.println("Order stuffed animals in the US stuffed animals store");
        StuffedAnimalStore us = new USStuffedAnimalStore();
        StuffedAnimal stuffedBearDoll = us.orderStuffedAnimal("bear", "plush", "wool", "brown");
        System.out.println(stuffedBearDoll);
        StuffedAnimal stuffedBunnyAnimal = us.orderStuffedAnimal("bunny", "cloth", "cotton", "white");
        System.out.println(stuffedBunnyAnimal);
    }
}
