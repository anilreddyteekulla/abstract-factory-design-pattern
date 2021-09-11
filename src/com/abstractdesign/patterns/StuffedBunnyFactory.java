package com.abstractdesign.patterns;

public class StuffedBunnyFactory implements AbstractStuffedFactory {

	private String name;
	private String material;
	private String color;
	private String size;
	private String brand;

	public StuffedBunnyFactory(String name, String material, String color, String size, String brand) {
		super();
		this.name = name;
		this.material = material;
		this.color = color;
		this.size = size;
		this.brand = brand;
	}

	@Override
	public StuffedDoll createDoll() {
		return new StuffedBunny(name, material, color, size, brand);
	}

}
