package cmm04.array;

import java.util.Scanner;

public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		No03_ForLoopArrayVO arrVO = new No03_ForLoopArrayVO();
		Scanner scanner = new Scanner(System.in);
		System.out.println("ù��°���� �Է��ϼ���");
		int a = scanner.nextInt();
		System.out.println("�ι�°���� �Է��ϼ���");
		int b = scanner.nextInt();
		System.out.println("����°���� �Է��ϼ���");
		int c = scanner.nextInt();
		System.out.println("�׹�°���� �Է��ϼ���");
		int d = scanner.nextInt();
		System.out.println("���������� �Է��ϼ���");
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
              