package java7;

import java.util.Objects;

public class RequireNonNull {

	public static void main(String[] args) {

		Person person = null;
		Objects.requireNonNull(person, "person Can't be null");

	}

	public class Person {
		private String firstName;
		private String lastName;

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

	}
}
