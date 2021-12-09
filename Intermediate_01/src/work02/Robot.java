package work02;

public class Robot {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void introduction() {
		System.out.println("ワタシハ" + name + "デス");
	}

}
