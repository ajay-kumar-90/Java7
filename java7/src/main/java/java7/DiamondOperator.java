package java7;

import java.util.HashMap;
import java.util.Map;

public class DiamondOperator {

	public static void main(String[] args) {
		//
		beforeJava7();
		withJava7();

	}

	private static void withJava7() {


		Map<String, Integer> inputMap = new HashMap<>();
		inputMap.put("January", 1);
		inputMap.put("Febuary", 2);
		inputMap.put("March", 3);
		inputMap.put("April", 4);
		inputMap.put("May", 5);
		inputMap.put("June", 6);
		inputMap.put("July", 7);
		inputMap.put("August", 8);
		inputMap.put("September", 9);
		inputMap.put("October", 10);
		inputMap.put("November", 11);
		inputMap.put("December", 12);


		for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("The value for the key "+ key + " is" + val);
		}

	}

	private static void beforeJava7() {

		Map<String, Integer> inputMap = new HashMap<>();
		inputMap.put("Monday", 1);
		inputMap.put("Tuesday", 2);
		inputMap.put("Wednesday", 3);
		inputMap.put("Thrusday", 4);
		inputMap.put("Friday", 5);
		inputMap.put("Saturday", 6);
		inputMap.put("Sunday", 7);

		for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println("The value for key" + key + "is " + val);

		}
	}

}
