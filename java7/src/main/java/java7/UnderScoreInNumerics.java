package java7;

public class UnderScoreInNumerics {

	public static void main(String[] args) {
		numericsBeforeJava7();
		numericsInJava7();

	}

	private static void numericsInJava7() {

		int num = 10_000_456;
		System.out.println("Integer Value is " + num);
		long lnum = 10_000_456l;
		System.out.println("Long value is " + lnum);
		float fnum = 3.14_13_25f;
		System.out.println("Float value is " + fnum);
		double dnum = 64_565.579_31_23;
		System.out.println("Double value is " + dnum);
		long longBinary = 0b0_000_011_101_100_011l;
		System.out.println("Decimal value of binary Representation using underscore is " + longBinary);

	}

	private static void numericsBeforeJava7() {
		int num = 10000456;
		System.out.println("Integer Value is "+ num);
		long lnum = 10000456l;
		System.out.println("Long value is "+ lnum);
		float fnum = 3.141325f;
		System.out.println("Float value is " + fnum);
		double dnum = 64565.21458;
		System.out.println("Double value is " + dnum);
		long longBinary = 0b01101011110010l;
		System.out.println("Decimal value of Binary value " + longBinary);

	}

}
