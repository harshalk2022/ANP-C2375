package question1;

import java.util.ArrayList;
import java.util.Collections;

public class SwapTwoElement {
	public static void main(String args[]) {

		// Create the Array List
		ArrayList<String> list = new ArrayList<String>();

		// Add the values in Array List
		list.add("Harshal");
		list.add("Achal");
		list.add("Rahul");
		list.add("Bhanesh");
		list.add("Jyostna");

		// Display Array List before swap
		System.out.print("Before Swaping : ");
		System.out.println(list);

		// Swapping the elements at 1 and 2 indices
		Collections.swap(list, 1, 2);

		// display Array List after swap
		System.out.print("After Swaping :");
		System.out.println(list);
	}
}
