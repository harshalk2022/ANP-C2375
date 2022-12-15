package question2;

import java.util.ArrayList;
import java.util.List;

public class AddElement {

	public static void main(String[] args) {

		// Create a list and add some colors to the list
		List<String> element = new ArrayList<String>();
		element.add("Rutika");
		element.add("Achal");
		element.add("Rahul");
		element.add("Jyostna");
		element.add("Bhanesh");

		// Print the list
		System.out.println(element);

		// Now insert a color at the first and last position of the list
		element.add(0, "Harshal");

		// Print the list
		System.out.println(element);
	}

}
