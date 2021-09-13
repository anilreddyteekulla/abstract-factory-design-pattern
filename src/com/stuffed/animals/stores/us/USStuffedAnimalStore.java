package com.stuffed.animals.stores.us;

import com.stuffed.animals.animals.StuffedAnimal;
import com.stuffed.animals.factory.AustraliaStuffedAnimalFactory;
import com.stuffed.animals.factory.USStuffedAnimalFactory;
import com.stuffed.animals.stores.StuffedAnimalStore;

public class USStuffedAnimalStore extends StuffedAnimalStore {
    protected StuffedAnimal makeStuffedAnimal(String name, String fabric, String stuffing, String color) {
        return switch (name) {
            case "bear" -> new KangarooAnimal(name, new USStuffedAnimalFactory(fabric, stuffing, color));
            case "bunny" -> new KoalaAnimal(name, new USStuffedAnimalFactory(fabric, stuffing, color));
            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
}
