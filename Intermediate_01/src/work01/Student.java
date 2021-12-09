package work01;

public class Student extends Human {
	
	public void speak() {
		System.out.println("名前は" + super.getName() + "です。学生です");
	}
	

}
