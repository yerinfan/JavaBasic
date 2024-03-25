package array;

public class Example04 {
	public static void main(String[] args) {
		int myArr[][] = { {1, 2, 3, 4, 5},
						  {6, 7, 8, 9, 10},
						  {11, 12, 13, 14, 15} 
		};
		
		for (int row = 0; row < 3; row++) {
			for (int col = 0; col < 5; col++) {
				System.out.print(myArr[row][col] + " ");
			}
			System.out.println("");
		}
		
		System.out.println("myArr[0][1] 값 " + myArr[0][1]);
	}
}
