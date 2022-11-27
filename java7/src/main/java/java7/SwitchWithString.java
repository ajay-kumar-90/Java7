package java7;

import java7.constants.Days;

public class SwitchWithString {

	public static void main(String[] args) {

		displayTodayDetails();
		displayWeekDetails();
	}

	private static void displayWeekDetails() {

		String input = Days.WEDNESDAY;
		switch (input) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case Days.WEDNESDAY:
			System.out.println("Today is Wednesday");
			break;
		case "Thrusday":
			System.out.println("Today is Thrusday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "Saturday":
			System.out.println("Today is Saturday");
			break;
		default:
			System.out.println("Today is Sunday");
			break;
		}
	}

	private static void displayTodayDetails() {
		String input = "Saturday";
		switch (input) {
		case "Monday":
		case "Tuesday":
		case Days.WEDNESDAY:
		case "Thrusday":
		case "Friday":
			System.out.println("Today is Weekday");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Today is Weekend");
			break;
		default:
			System.out.println("Today is Holiday");
			break;
		}
	}

}
