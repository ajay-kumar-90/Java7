package java7;

public class BinaryLiteralsJava7 {

	public static void main(String[] args) {

		byte byteBinary = 0b111;
		short shortBinary = 0b001;
		int intBinary = 0b101;
		long longBinary = 0b10111101;

		System.out.println("The value of byte number is : " + byteBinary);
		System.out.println("The value of short number is : " + shortBinary);
		System.out.println("The value of int number is : " + intBinary);
		System.out.println("The value of long number is : " + longBinary);

		int num = 5;
		System.out.println("Is Decimal and Binary Same " + (num == intBinary));
		System.out.println("The value of long after multiplication is " + (longBinary * 2));

	}

}
