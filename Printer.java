package chap04;

public class Printer {
	private int numOfPapers;
	private boolean duplex;
	
	
	public void print(int amount) {
		
		if (getDuplex()) { // 만약에 양면이면 amount/2 개 출력
			amount = (amount % 2 == 0) ? amount / 2 : amount / 2 + 1;
			//용지 없음
			if (isEmpty()) {
				System.out.println("용지가 없습니다.");
				return;
			}
			//용지 충분
			else if (numOfPapers >= amount) {
				this.numOfPapers -= amount;
				System.out.printf("양면으로 %d장 출력했습니다. 현재 %d장 남아있습니다.\n", amount, numOfPapers);
			}
			
			//용지 부족
			else {
				System.out.printf("모두 출력하려면 용지가 %d장 부족합니다. 양면으로 %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
				this.numOfPapers = 0;
			}
		}
		
		
		//용지 없음
		if (isEmpty()) {
			System.out.println("용지가 없습니다.");
			return;
		}
		//용지 충분
		else if (numOfPapers >= amount) {
			this.numOfPapers -= amount;
			System.out.printf("단면으로 %d장 출력했습니다. 현재 %d장 남아있습니다.\n", amount, numOfPapers);
		}
		
		//용지 부족
		else {
			System.out.printf("모두 출력하려면 용지가 %d장 부족합니다. 단면으로 %d장만 출력합니다.\n", amount - numOfPapers, numOfPapers);
			this.numOfPapers = 0;
		}
		
	}
	
	

	 public boolean getDuplex() {
		 return duplex;
	 }
	 
	public void setDuplex(boolean duplex) {
		this.duplex = duplex;
	}

	public Printer(int numOfPapers, boolean duplex) {
		this.numOfPapers = numOfPapers;
		this.duplex = duplex;
	}
	public Printer(int numOfPapers) {
		this.numOfPapers = numOfPapers;
	}
	
	 public boolean isEmpty() {
		 if (numOfPapers == 0) return true;
		 
		 return false;
	 }
	
	
	
}
