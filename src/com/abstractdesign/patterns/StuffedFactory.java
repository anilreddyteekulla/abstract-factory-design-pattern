package com.abstractdesign.patterns;

public class StuffedFactory {

	public StuffedFactory() {
	}

	public static StuffedDoll createStuffedDoll(AbstractStuffedFactory factory) {

		return factory.createDoll();
	}

}
