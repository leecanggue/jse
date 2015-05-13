package cmm04.array;

public class No03_ForLoopArrayVO {
	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}
	
	void ForArray() {

		int[] arr = { getA(), getB(), getC(), getD(), getE() };
		int result = 0;

		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		System.out.println("1부터 5까지의 합은 : " + result);

	}
}
