package com.stuffed.animals.stores.australia;

import com.stuffed.animals.animals.StuffedAnimal;
import com.stuffed.animals.factory.AustraliaStuffedAnimalFactory;
import com.stuffed.animals.stores.StuffedAnimalStore;

public class AustraliaStuffedAnimalStore extends StuffedAnimalStore {
    protected StuffedAnimal makeStuffedAnimal(String name, String fabric, String stuffing, String color) {
        return switch (name) {
            case "kangaroo" -> new KangarooAnimal(name, new AustraliaStuffedAnimalFactory(fabric, stuffing, color));
            case "koala" -> new KoalaAnimal(name, new AustraliaStuffedAnimalFactory(fabric, stuffing, color));
            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
}
