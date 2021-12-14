package model;

public class HumanManager {
	public static Human getHuman(String name, String age) {
		int iAge = Integer.parseInt(age);
		return new Human(name, iAge);
	}

}
