package com.stuffed.animals.factory;

import com.stuffed.animals.colors.Color;
import com.stuffed.animals.colors.impl.DarkBrownColor;
import com.stuffed.animals.colors.impl.WhiteColor;
import com.stuffed.animals.fabrics.Fabric;
import com.stuffed.animals.fabrics.impl.ClothFabric;
import com.stuffed.animals.fabrics.impl.PlushFabric;
import com.stuffed.animals.stuffings.Stuffing;
import com.stuffed.animals.stuffings.impl.BeansStuffing;
import com.stuffed.animals.stuffings.impl.CottonStuffing;
import com.stuffed.animals.stuffings.impl.SyntheticFiberStuffing;
import com.stuffed.animals.stuffings.impl.WoodStuffing;

public class AustraliaStuffedAnimalFactory implements StuffedAnimalFactory {

    private String fabric;
    private String stuffing;
    private String color;

    public AustraliaStuffedAnimalFactory(String fabric, String stuffing, String color) {
        this.fabric = fabric;
        this.stuffing = stuffing;
        this.color = color;
    }

    @Override
    public Fabric getFabric() {
        return switch (fabric) {
            case "plush" -> new PlushFabric();
            case "cloth" -> new ClothFabric();
            default -> throw new IllegalStateException("Unexpected value: " + fabric);
        };
    }

    @Override
    public Stuffing getStuffing() {
        return switch (stuffing) {
            case "beans" -> new BeansStuffing();
            case "cotton" -> new CottonStuffing();
            case "synthetic fiber" -> new SyntheticFiberStuffing();
            case "wood" -> new WoodStuffing();
            default -> throw new IllegalStateException("Unexpected value: " + fabric);
        };
    }

    @Override
    public Color getColor() {
        return switch (color) {
            case "dark brown" -> new DarkBrownColor();
            case "brown" -> new WhiteColor();
            default -> throw new IllegalStateException("Unexpected value: " + fabric);
        };
    }
}