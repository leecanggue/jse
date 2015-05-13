package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		No03_ForLoopArrayVO arrVO = new No03_ForLoopArrayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("첫번째값을 입력하세요");
		int a = scanner.nextInt();
		System.out.println("두번째값을 입력하세요");
		int b = scanner.nextInt();
		System.out.println("세번째값을 입력하세요");
		int c = scanner.nextInt();
		System.out.println("네번째값을 입력하세요");
		int d = scanner.nextInt();
		System.out.println("마지막값을 입력하세요");
		int e = scanner.nextInt();
		
		arrVO.setA(a);
		arrVO.setB(b);
		arrVO.setC(c);
		arrVO.setD(d);
		arrVO.setE(e);
		
		arrVO.ForArray();
		scanner.close();
	}
} 
              