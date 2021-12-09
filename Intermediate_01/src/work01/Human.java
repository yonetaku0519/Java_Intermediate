package work01;

public class Human {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void speak() {
		System.out.println("名前は" + name + "です");
		System.out.println("年齢は" + age + "です");
	}
	
	

}
