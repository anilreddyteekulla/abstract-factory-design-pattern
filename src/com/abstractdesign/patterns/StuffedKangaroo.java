package com.abstractdesign.patterns;

public class StuffedKangaroo implements StuffedDoll {

	private String name;
	private String material;
	private String color;
	private String size;
	private String brand;

	public StuffedKangaroo(String name, String material, String color, String size, String brand) {
		super();
		this.name = name;
		this.material = material;
		this.color = color;
		this.size = size;
		this.brand = brand;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getMaterail() {
		return this.material;
	}

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public String getSize() {
		return this.size;
	}

	@Override
	public String getBrand() {
		return this.brand;
	}

	@Override
	public String toString() {
		return "StuffedKangaroo [name=" + name + ", material=" + material + ", color=" + color + ", size=" + size
				+ ", brand=" + brand + "]";
	}

}
