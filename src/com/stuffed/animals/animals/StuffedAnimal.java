package com.stuffed.animals.animals;

import com.stuffed.animals.colors.Color;
import com.stuffed.animals.fabrics.Fabric;
import com.stuffed.animals.factory.StuffedAnimalFactory;
import com.stuffed.animals.stuffings.Stuffing;

public abstract class StuffedAnimal {

    private final String name;
    private final Fabric fabric;
    private final Stuffing stuffing;
    private final Color color;
    private StuffedAnimalFactory stuffedAnimalFactory;

    public StuffedAnimal(String name, StuffedAnimalFactory stuffedAnimalFactory) {
        this.name = name;
        this.stuffedAnimalFactory = stuffedAnimalFactory;
        this.fabric = stuffedAnimalFactory.getFabric();
        this.stuffing = stuffedAnimalFactory.getStuffing();
        this.color = stuffedAnimalFactory.getColor();
    }

    public void assembleStuffedAnimal() {
        System.out.println("*** Assembling stuffed " + name + " animal ***");
        System.out.println("1. Preparing " + color.getColor() + " " + fabric.getFabric() + " fabric.");
        System.out.println("2. Sewing " + fabric.getFabric() + " fabric.");
        System.out.println("3. Stuffing " + name + " animal with " + stuffing.getStuffing());
    }

    @Override
    public String toString() {
        return color.getColor() +
                " " + fabric.getFabric() +
                " " + name +
                " stuffed with " + stuffing.getStuffing() +
                " is ready.\n";
    }
}
