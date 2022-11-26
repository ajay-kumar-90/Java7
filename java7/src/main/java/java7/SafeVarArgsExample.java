package java7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SafeVarArgsExample {

	public static void main(String[] args) {

		sum(1);
		sum(1, 2);
		sum(1, 2, 3);

		SafeVarArgsExample varArgsExample = new SafeVarArgsExample();

		List<String> list1 = new ArrayList<>();

		List<String> list2 = new ArrayList<>();

		List<String> list3 = new ArrayList<>();
		list1.add("Lets");
		list2.add("Learn");
		list3.add("java 8");

		varArgsExample.print(list1, list2, list3);
	}

	@SafeVarargs
	private final void print(List<String>... messages) {
		String firstElement = messages[0].get(0);
		System.out.println(firstElement);

	}

	private static void sum(int... nums) {
		System.out.println(Arrays.toString(nums));
		int sum = 0;
		for (int num : nums) {
			sum = +num;
		}
		System.out.println("The total sum for the given input is : " + sum);
	}

}
