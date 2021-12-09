package work01;

public class Run {
	public static void main(String[] args) {
		
		Human h = new Human();
		
		h.setName("田中");
		h.setAge(25);
		
		Student s = new Student();
		s.setName("佐藤");
		s.setAge(20);
		
		Human h1 = h;
		Human h2 = s;
		
		System.out.println("親クラスのスピークメソッドを実行");
		h1.speak();

		System.out.println("子クラスのスピークメソッドを実行");
		h2.speak();
	}

}
