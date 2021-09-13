package com.stuffed.animals.stores;

import com.stuffed.animals.animals.StuffedAnimal;

public abstract class StuffedAnimalStore {
    protected abstract StuffedAnimal makeStuffedAnimal(String name, String fabric, String stuffing, String color);

    public StuffedAnimal orderStuffedAnimal(String name, String fabric, String stuffing, String color) {
        StuffedAnimal stuffedAnimal = makeStuffedAnimal(name, fabric, stuffing, color);
        stuffedAnimal.assembleStuffedAnimal();
        return stuffedAnimal;
    }
}
