package chap07;

interface Human {
	
	public static void echo() {
		System.out.println("야호~~!");
	}
	
	void print();
	
	void eat();
}

class Worker implements Human {
	public void eat() {
		System.out.println("빵을 먹습니다.");
	}
	
	public void print() {
		System.out.println("인간입니다.");
	}
}

class Student implements Human {
	
	int age;
	
	public Student(int age) {
		this.age = age;
	}

	public void eat() {
		System.out.println("도시락을 먹습니다.");
	}
	
	public void print() {
		System.out.printf("%d세의 학생입니다.\n", age);
	}
}

public class HumanTest {

	public static void main(String[] args) {
		Human.echo();
		
		Student s = new Student(20);
		s.print();
		s.eat();
		
		Human p = new Worker();
		p.print();
		p.eat();
	}

}
