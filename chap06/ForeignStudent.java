package chap06;

public class ForeignStudent extends Student{
	
	String nation;
	
	public ForeignStudent(String name, int age, int stID, String nation) {
		super(name, age, stID);
		this.nation = nation;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public void show() {
		System.out.printf("외국학생[이름 : %s, 나이 : %d, 학번 : %d, 국적 : %s]", name, age, stID, nation);
	}
	
	
}
