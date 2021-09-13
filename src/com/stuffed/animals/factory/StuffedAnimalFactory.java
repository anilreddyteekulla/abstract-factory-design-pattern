package com.stuffed.animals.factory;

import com.stuffed.animals.colors.Color;
import com.stuffed.animals.fabrics.Fabric;
import com.stuffed.animals.stuffings.Stuffing;

public interface StuffedAnimalFactory {
    Fabric getFabric();

    Stuffing getStuffing();

    Color getColor();
}
