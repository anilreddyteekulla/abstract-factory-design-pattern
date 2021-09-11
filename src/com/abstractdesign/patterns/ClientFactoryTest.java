package com.abstractdesign.patterns;

public class ClientFactoryTest {

	public static void main(String[] args) {
		StuffedDoll stuffedBear = StuffedFactory
				.createStuffedDoll(new StuffedBearFactory("Teddy Bear", "Plush", "Brown", "35cm", "Lego"));
		System.out.println(" Bear Doll Description	: " + stuffedBear);

		StuffedDoll stuffedBunny = StuffedFactory
				.createStuffedDoll(new StuffedBunnyFactory("Blinking Rabbit", "Super soft", "Pink", "60cm", "Barbie"));
		System.out.println(" Bunny Doll Description	: " + stuffedBunny);

		StuffedDoll stuffedCat = StuffedFactory.createStuffedDoll(
				new StuffedCatFactory("Cat lion plush toy", "short Plush", "Dark Brown", "40cm", "Hasbro"));
		System.out.println(" Cat Doll Description	: " + stuffedCat);

		StuffedDoll stuffedKangaroo = StuffedFactory.createStuffedDoll(
				new StuffedKangarooFactory(" Cute kangaroo", "Crystal super soft", "Dark Brown", "45cm", "Monopoly"));
		System.out.println(" Kangaroo Doll Description: " + stuffedKangaroo);

	}
}
