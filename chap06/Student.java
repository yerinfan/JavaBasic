package chap06;

public class Student extends Person {

	int stID;
	
	public Student(String name, int age, int stID) {
		super(name, age);
		this.stID = stID;
	}
	
	public int getStID() {
		return stID;
	}

	public void setStID(int stID) {
		this.stID = stID;
	}
	
	public void show() {
		System.out.printf("학생[이름 : %s, 나이 : %d, 학번 : %d]\n", name, age, stID);
	}
	
	
}
