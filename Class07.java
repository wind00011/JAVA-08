package Java08;
class CTest {
	int x;

	void test(int x) {
		if (x % 2 == 1)
			System.out.println("计计");
		else if (x == 0)
			System.out.println("计0");
		else
			System.out.println("计案计");

	}
}

public class Class07 {
	public static void main(String args[]) {

		CTest ss = new CTest();
		System.out.println("test(0)");
		ss.test(0);
		System.out.println("test(3)");
		ss.test(3);
		System.out.println("test(8)");
		ss.test(8);
	}
}